package com.udacity.asteroidradar.detail

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.udacity.asteroidradar.domain.Asteroid

class DetailViewModel(asteroid: Asteroid, app: Application) : AndroidViewModel(app) {
    private val _selectedItem = MutableLiveData<Asteroid>()

    val selectedItem: LiveData<Asteroid>
        get() = selectedItem

    init {
        _selectedItem.value = asteroid
    }
}