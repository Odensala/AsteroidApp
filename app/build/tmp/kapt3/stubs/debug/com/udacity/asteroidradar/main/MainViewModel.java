package com.udacity.asteroidradar.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/udacity/asteroidradar/main/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "AsteroidRepository", "Lcom/udacity/asteroidradar/repository/AsteroidRepository;", "_asteroids", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/udacity/asteroidradar/Asteroid;", "_dailyPicture", "Lcom/udacity/asteroidradar/PictureOfDay;", "asteroids", "Landroidx/lifecycle/LiveData;", "getAsteroids", "()Landroidx/lifecycle/LiveData;", "asteroidsForFragment", "dailyPicture", "getDailyPicture", "database", "Ldatabase/AsteroidDatabase;", "getPictureOfDayResponse", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<com.udacity.asteroidradar.PictureOfDay> _dailyPicture = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.udacity.asteroidradar.Asteroid>> _asteroids = null;
    private final database.AsteroidDatabase database = null;
    private final com.udacity.asteroidradar.repository.AsteroidRepository AsteroidRepository = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.Asteroid>> asteroidsForFragment = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.udacity.asteroidradar.PictureOfDay> getDailyPicture() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.Asteroid>> getAsteroids() {
        return null;
    }
    
    private final void getPictureOfDayResponse() {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}