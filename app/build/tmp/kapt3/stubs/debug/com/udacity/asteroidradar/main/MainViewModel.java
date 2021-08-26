package com.udacity.asteroidradar.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000bJ\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/udacity/asteroidradar/main/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "AsteroidRepository", "Lcom/udacity/asteroidradar/repository/AsteroidRepository;", "_dailyPicture", "Landroidx/lifecycle/MutableLiveData;", "Lcom/udacity/asteroidradar/domain/PictureOfDay;", "_navigateToSelectedAsteroid", "Lcom/udacity/asteroidradar/domain/Asteroid;", "asteroidsForFragment", "Landroidx/lifecycle/LiveData;", "", "getAsteroidsForFragment", "()Landroidx/lifecycle/LiveData;", "dailyPicture", "getDailyPicture", "database", "Ldatabase/AsteroidDatabase;", "navigateToSelectedAsteroid", "getNavigateToSelectedAsteroid", "displayAsteroidCompleted", "", "displayAsteroidDetails", "asteroid", "getPictureOfDayResponse", "updateFilter", "filter", "Lcom/udacity/asteroidradar/api/AsteroidFilter;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<com.udacity.asteroidradar.domain.PictureOfDay> _dailyPicture = null;
    private final androidx.lifecycle.MutableLiveData<com.udacity.asteroidradar.domain.Asteroid> _navigateToSelectedAsteroid = null;
    private final database.AsteroidDatabase database = null;
    private final com.udacity.asteroidradar.repository.AsteroidRepository AsteroidRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.domain.Asteroid>> asteroidsForFragment = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.udacity.asteroidradar.domain.PictureOfDay> getDailyPicture() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.udacity.asteroidradar.domain.Asteroid> getNavigateToSelectedAsteroid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.domain.Asteroid>> getAsteroidsForFragment() {
        return null;
    }
    
    private final void getPictureOfDayResponse() {
    }
    
    /**
     * Takes an asteroid and assigns it to the value
     */
    public final void displayAsteroidDetails(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.domain.Asteroid asteroid) {
    }
    
    public final void displayAsteroidCompleted() {
    }
    
    /**
     * Updates filter according to enum parameters
     */
    public final void updateFilter(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.api.AsteroidFilter filter) {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}