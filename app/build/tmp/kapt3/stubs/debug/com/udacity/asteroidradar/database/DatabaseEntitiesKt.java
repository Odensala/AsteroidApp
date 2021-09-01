package com.udacity.asteroidradar.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a%\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\u0002\u0010\u0006\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b*\b\u0012\u0004\u0012\u00020\u00020\b\u00a8\u0006\t"}, d2 = {"asDatabaseModel", "", "Lcom/udacity/asteroidradar/database/DatabaseAsteroid;", "Ljava/util/ArrayList;", "Lcom/udacity/asteroidradar/domain/Asteroid;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)[Lcom/udacity/asteroidradar/database/DatabaseAsteroid;", "asDomainModel", "", "app_debug"})
public final class DatabaseEntitiesKt {
    
    /**
     * Extension function which converts from database objects to domain objects and extends asDomainModel().
     * We want separation of concerns which is the reason why this approach is used.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.udacity.asteroidradar.domain.Asteroid> asDomainModel(@org.jetbrains.annotations.NotNull()
    java.util.List<com.udacity.asteroidradar.database.DatabaseAsteroid> $this$asDomainModel) {
        return null;
    }
    
    /**
     * Data transfer object
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.udacity.asteroidradar.database.DatabaseAsteroid[] asDatabaseModel(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.udacity.asteroidradar.domain.Asteroid> $this$asDatabaseModel) {
        return null;
    }
}