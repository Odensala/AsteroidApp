package com.udacity.asteroidradar.repository;

import java.lang.System;

/**
 * Repository for refreshing and loading asteroids
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007J\u0011\u0010\u0012\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/udacity/asteroidradar/repository/AsteroidRepository;", "", "database", "Lcom/udacity/asteroidradar/database/AsteroidDatabase;", "(Lcom/udacity/asteroidradar/database/AsteroidDatabase;)V", "asteroidFilter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/udacity/asteroidradar/api/AsteroidFilter;", "kotlin.jvm.PlatformType", "asteroids", "Landroidx/lifecycle/LiveData;", "", "Lcom/udacity/asteroidradar/domain/Asteroid;", "getAsteroids", "()Landroidx/lifecycle/LiveData;", "getAsteroidsFiltered", "", "filter", "refreshAsteroids", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AsteroidRepository {
    private androidx.lifecycle.MutableLiveData<com.udacity.asteroidradar.api.AsteroidFilter> asteroidFilter;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.domain.Asteroid>> asteroids = null;
    private final com.udacity.asteroidradar.database.AsteroidDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.udacity.asteroidradar.domain.Asteroid>> getAsteroids() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshAsteroids(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public final void getAsteroidsFiltered(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.api.AsteroidFilter filter) {
    }
    
    public AsteroidRepository(@org.jetbrains.annotations.NotNull()
    com.udacity.asteroidradar.database.AsteroidDatabase database) {
        super();
    }
}