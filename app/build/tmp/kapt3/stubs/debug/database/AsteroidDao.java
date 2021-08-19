package database;

import java.lang.System;

/**
 * Holds all the necessary methods to access the database.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\'J!\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000f\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Ldatabase/AsteroidDao;", "", "getAllAsteroids", "Landroidx/lifecycle/LiveData;", "", "Ldatabase/DatabaseAsteroid;", "getTodayAsteroids", "today", "", "getWeekAsteroids", "startDay", "endDay", "insertAll", "", "asteroids", "", "([Ldatabase/DatabaseAsteroid;)V", "app_debug"})
public abstract interface AsteroidDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from DatabaseAsteroid order by closeApproachDate desc")
    public abstract androidx.lifecycle.LiveData<java.util.List<database.DatabaseAsteroid>> getAllAsteroids();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from DatabaseAsteroid where closeApproachDate = :today")
    public abstract androidx.lifecycle.LiveData<java.util.List<database.DatabaseAsteroid>> getTodayAsteroids(@org.jetbrains.annotations.NotNull()
    java.lang.String today);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from DatabaseAsteroid where closeApproachDate between :startDay and :endDay")
    public abstract androidx.lifecycle.LiveData<java.util.List<database.DatabaseAsteroid>> getWeekAsteroids(@org.jetbrains.annotations.NotNull()
    java.lang.String startDay, @org.jetbrains.annotations.NotNull()
    java.lang.String endDay);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    database.DatabaseAsteroid... asteroids);
}