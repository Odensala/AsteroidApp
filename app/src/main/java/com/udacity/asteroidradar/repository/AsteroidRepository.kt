package com.udacity.asteroidradar.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.udacity.asteroidradar.Asteroid
import com.udacity.asteroidradar.Constants
import com.udacity.asteroidradar.api.*
import database.AsteroidDatabase
import database.asDatabaseModel
import database.asDomainModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject

/**
 * Repository for refreshing and loading asteroids
 */
class AsteroidRepository(private val database: AsteroidDatabase) {


    // LiveData for asteroids displayed in RecyclerView
    val asteroids: LiveData<List<Asteroid>> =
        Transformations.map(database.asteroidDao.getAllAsteroids()) {
            it.asDomainModel()
        }

    suspend fun refreshAsteroids() {
        try {
            withContext(Dispatchers.IO) {
                val asteroidsRefresh =
                    AsteroidApi.retrofitService.getAsteroids(
                        getStartDateFormatted(),
                        getEndDateFormatted(),
                        Constants.API_KEY
                    )
                var jsonParsedAsteroids = parseAsteroidsJsonResult(JSONObject(asteroidsRefresh))

                database.asteroidDao.insertAll(*jsonParsedAsteroids.asDatabaseModel())
            }
        } catch (e: Exception) {
            Log.e("repo", "refreshAsteroids")
        }
    }

    /**
     * Selects appropriate filter according to menu choice
     */
    fun getAsteroidSelection(filter: AsteroidFilter): LiveData<List<Asteroid>> {
        return when (filter) {
            (AsteroidFilter.SHOW_TODAY) -> Transformations.map(
                database.asteroidDao.getTodayAsteroids(
                    getStartDateFormatted()
                )
            ) {
                it.asDomainModel()
            }
            (AsteroidFilter.SHOW_WEEK) -> Transformations.map(
                database.asteroidDao.getWeekAsteroids(
                    getStartDateFormatted(),
                    getEndDateFormatted()
                )
            ) {
                it.asDomainModel()
            }
            else -> Transformations.map(database.asteroidDao.getAllAsteroids()) {
                it.asDomainModel()
            }
        }
    }
}



