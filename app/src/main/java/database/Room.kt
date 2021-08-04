package database

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.*

/**
 * Holds all the necessary methods to access the database.
 */
@Dao
interface AsteroidDao {
    // Need to add more querys here
    @Query("select * from databaseasteroid")
    fun getAsteroids(): LiveData<List<DatabaseAsteroid>>

    // If the same asteroids are inserted then it will replace
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg asteroids: DatabaseAsteroid)
}

/**
 * Room database
 */
@Database(entities = [DatabaseAsteroid::class], version = 1)
abstract class AsteroidDatabase : RoomDatabase() {
    abstract val asteroidDao: AsteroidDao
}

// Singleton, meaning only one instance can be used and created
private lateinit var INSTANCE: AsteroidDatabase

/**
 * Function that gets and returns the AsteroidDatabase
 */
fun getDatabase(context: Context): AsteroidDatabase {
    // Initialization is thread-safe when wrapped in synchronized
    synchronized(AsteroidDatabase::class.java) {
        // Checks whether the database has been initialized
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                AsteroidDatabase::class.java,
                "asteroids"
            ).build()
        }
    }
    return INSTANCE
}
