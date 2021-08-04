package com.udacity.asteroidradar.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.udacity.asteroidradar.Asteroid
import com.udacity.asteroidradar.Constants
import com.udacity.asteroidradar.api.AsteroidApi
import com.udacity.asteroidradar.api.parseAsteroidsJsonResult
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

    // As long as we call this one we can use it in a recyclerView
    val asteroids: LiveData<List<Asteroid>> =
        Transformations.map(database.asteroidDao.getAsteroids()) {
            it.asDomainModel()
        }

    suspend fun refreshAsteroids() {
        try {
            withContext(Dispatchers.IO) {
                val asteroids = AsteroidApi.retrofitService.getAsteroids(Constants.API_KEY)
                var jsonParsedAsteroids = parseAsteroidsJsonResult(JSONObject(asteroids))
                database.asteroidDao.insertAll(*jsonParsedAsteroids.asDatabaseModel())
            }
        } catch (e: Exception) {
            Log.e("repo", "refreshAsteroids")
        }

    }
}