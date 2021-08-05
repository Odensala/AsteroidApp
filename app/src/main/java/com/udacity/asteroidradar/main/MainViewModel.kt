package com.udacity.asteroidradar.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.udacity.asteroidradar.Asteroid
import com.udacity.asteroidradar.Constants
import com.udacity.asteroidradar.PictureOfDay
import com.udacity.asteroidradar.api.PictureOfDayApi
import com.udacity.asteroidradar.repository.AsteroidRepository
import database.getDatabase
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    // LiveData for the daily image
    private val _dailyPicture =
        MutableLiveData<PictureOfDay>()
    val dailyPicture: LiveData<PictureOfDay>
        get() = _dailyPicture

    // LiveData for the asteroid
    private val _asteroids =
        MutableLiveData<List<Asteroid>>()
    val asteroids: LiveData<List<Asteroid>>
        get() = _asteroids

    private val database = getDatabase(application)
    private val AsteroidRepository = AsteroidRepository(database)
    val asteroidsForFragment = AsteroidRepository.asteroids

    init {
        getPictureOfDayResponse()
        viewModelScope.launch {
            AsteroidRepository.refreshAsteroids()
        }
    }

    private fun getPictureOfDayResponse() {
        viewModelScope.launch {
            try {
                // Grabs picture from retrofit and assigns it to mutable livedata variable
                var tempPictureOfDay =
                    PictureOfDayApi.retrofitService.getPictureOfDay(Constants.API_KEY)
                _dailyPicture.value = tempPictureOfDay
            } catch (e: Exception) {
                // Log the exception
                e.printStackTrace()
            }
        }
    }
}