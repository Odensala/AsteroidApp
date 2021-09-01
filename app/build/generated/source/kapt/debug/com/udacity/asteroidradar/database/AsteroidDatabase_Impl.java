package com.udacity.asteroidradar.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AsteroidDatabase_Impl extends AsteroidDatabase {
  private volatile AsteroidDao _asteroidDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DatabaseAsteroid` (`id` INTEGER NOT NULL, `codename` TEXT NOT NULL, `closeApproachDate` TEXT NOT NULL, `absoluteMagnitude` REAL NOT NULL, `estimatedDiameter` REAL NOT NULL, `relativeVelocity` REAL NOT NULL, `distanceFromEarth` REAL NOT NULL, `isPotentiallyHazardous` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7b82b2fc24c938d058c2811730db0357')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `DatabaseAsteroid`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDatabaseAsteroid = new HashMap<String, TableInfo.Column>(8);
        _columnsDatabaseAsteroid.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseAsteroid.put("codename", new TableInfo.Column("codename", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseAsteroid.put("closeApproachDate", new TableInfo.Column("closeApproachDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseAsteroid.put("absoluteMagnitude", new TableInfo.Column("absoluteMagnitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseAsteroid.put("estimatedDiameter", new TableInfo.Column("estimatedDiameter", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseAsteroid.put("relativeVelocity", new TableInfo.Column("relativeVelocity", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseAsteroid.put("distanceFromEarth", new TableInfo.Column("distanceFromEarth", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDatabaseAsteroid.put("isPotentiallyHazardous", new TableInfo.Column("isPotentiallyHazardous", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDatabaseAsteroid = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDatabaseAsteroid = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDatabaseAsteroid = new TableInfo("DatabaseAsteroid", _columnsDatabaseAsteroid, _foreignKeysDatabaseAsteroid, _indicesDatabaseAsteroid);
        final TableInfo _existingDatabaseAsteroid = TableInfo.read(_db, "DatabaseAsteroid");
        if (! _infoDatabaseAsteroid.equals(_existingDatabaseAsteroid)) {
          return new RoomOpenHelper.ValidationResult(false, "DatabaseAsteroid(com.udacity.asteroidradar.database.DatabaseAsteroid).\n"
                  + " Expected:\n" + _infoDatabaseAsteroid + "\n"
                  + " Found:\n" + _existingDatabaseAsteroid);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7b82b2fc24c938d058c2811730db0357", "b0839bd8206b2b9f4728f214f825c21f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "DatabaseAsteroid");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `DatabaseAsteroid`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(AsteroidDao.class, AsteroidDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public AsteroidDao getAsteroidDao() {
    if (_asteroidDao != null) {
      return _asteroidDao;
    } else {
      synchronized(this) {
        if(_asteroidDao == null) {
          _asteroidDao = new AsteroidDao_Impl(this);
        }
        return _asteroidDao;
      }
    }
  }
}
