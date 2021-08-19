package database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AsteroidDao_Impl implements AsteroidDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DatabaseAsteroid> __insertionAdapterOfDatabaseAsteroid;

  public AsteroidDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDatabaseAsteroid = new EntityInsertionAdapter<DatabaseAsteroid>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `DatabaseAsteroid` (`id`,`codename`,`closeApproachDate`,`absoluteMagnitude`,`estimatedDiameter`,`relativeVelocity`,`distanceFromEarth`,`isPotentiallyHazardous`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DatabaseAsteroid value) {
        stmt.bindLong(1, value.getId());
        if (value.getCodename() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCodename());
        }
        if (value.getCloseApproachDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCloseApproachDate());
        }
        stmt.bindDouble(4, value.getAbsoluteMagnitude());
        stmt.bindDouble(5, value.getEstimatedDiameter());
        stmt.bindDouble(6, value.getRelativeVelocity());
        stmt.bindDouble(7, value.getDistanceFromEarth());
        final int _tmp;
        _tmp = value.isPotentiallyHazardous() ? 1 : 0;
        stmt.bindLong(8, _tmp);
      }
    };
  }

  @Override
  public void insertAll(final DatabaseAsteroid... asteroids) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDatabaseAsteroid.insert(asteroids);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<DatabaseAsteroid>> getAllAsteroids() {
    final String _sql = "select * from DatabaseAsteroid order by closeApproachDate desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"DatabaseAsteroid"}, false, new Callable<List<DatabaseAsteroid>>() {
      @Override
      public List<DatabaseAsteroid> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCodename = CursorUtil.getColumnIndexOrThrow(_cursor, "codename");
          final int _cursorIndexOfCloseApproachDate = CursorUtil.getColumnIndexOrThrow(_cursor, "closeApproachDate");
          final int _cursorIndexOfAbsoluteMagnitude = CursorUtil.getColumnIndexOrThrow(_cursor, "absoluteMagnitude");
          final int _cursorIndexOfEstimatedDiameter = CursorUtil.getColumnIndexOrThrow(_cursor, "estimatedDiameter");
          final int _cursorIndexOfRelativeVelocity = CursorUtil.getColumnIndexOrThrow(_cursor, "relativeVelocity");
          final int _cursorIndexOfDistanceFromEarth = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceFromEarth");
          final int _cursorIndexOfIsPotentiallyHazardous = CursorUtil.getColumnIndexOrThrow(_cursor, "isPotentiallyHazardous");
          final List<DatabaseAsteroid> _result = new ArrayList<DatabaseAsteroid>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DatabaseAsteroid _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCodename;
            _tmpCodename = _cursor.getString(_cursorIndexOfCodename);
            final String _tmpCloseApproachDate;
            _tmpCloseApproachDate = _cursor.getString(_cursorIndexOfCloseApproachDate);
            final double _tmpAbsoluteMagnitude;
            _tmpAbsoluteMagnitude = _cursor.getDouble(_cursorIndexOfAbsoluteMagnitude);
            final double _tmpEstimatedDiameter;
            _tmpEstimatedDiameter = _cursor.getDouble(_cursorIndexOfEstimatedDiameter);
            final double _tmpRelativeVelocity;
            _tmpRelativeVelocity = _cursor.getDouble(_cursorIndexOfRelativeVelocity);
            final double _tmpDistanceFromEarth;
            _tmpDistanceFromEarth = _cursor.getDouble(_cursorIndexOfDistanceFromEarth);
            final boolean _tmpIsPotentiallyHazardous;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPotentiallyHazardous);
            _tmpIsPotentiallyHazardous = _tmp != 0;
            _item = new DatabaseAsteroid(_tmpId,_tmpCodename,_tmpCloseApproachDate,_tmpAbsoluteMagnitude,_tmpEstimatedDiameter,_tmpRelativeVelocity,_tmpDistanceFromEarth,_tmpIsPotentiallyHazardous);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<DatabaseAsteroid>> getTodayAsteroids(final String today) {
    final String _sql = "select * from DatabaseAsteroid where closeApproachDate = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (today == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, today);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"DatabaseAsteroid"}, false, new Callable<List<DatabaseAsteroid>>() {
      @Override
      public List<DatabaseAsteroid> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCodename = CursorUtil.getColumnIndexOrThrow(_cursor, "codename");
          final int _cursorIndexOfCloseApproachDate = CursorUtil.getColumnIndexOrThrow(_cursor, "closeApproachDate");
          final int _cursorIndexOfAbsoluteMagnitude = CursorUtil.getColumnIndexOrThrow(_cursor, "absoluteMagnitude");
          final int _cursorIndexOfEstimatedDiameter = CursorUtil.getColumnIndexOrThrow(_cursor, "estimatedDiameter");
          final int _cursorIndexOfRelativeVelocity = CursorUtil.getColumnIndexOrThrow(_cursor, "relativeVelocity");
          final int _cursorIndexOfDistanceFromEarth = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceFromEarth");
          final int _cursorIndexOfIsPotentiallyHazardous = CursorUtil.getColumnIndexOrThrow(_cursor, "isPotentiallyHazardous");
          final List<DatabaseAsteroid> _result = new ArrayList<DatabaseAsteroid>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DatabaseAsteroid _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCodename;
            _tmpCodename = _cursor.getString(_cursorIndexOfCodename);
            final String _tmpCloseApproachDate;
            _tmpCloseApproachDate = _cursor.getString(_cursorIndexOfCloseApproachDate);
            final double _tmpAbsoluteMagnitude;
            _tmpAbsoluteMagnitude = _cursor.getDouble(_cursorIndexOfAbsoluteMagnitude);
            final double _tmpEstimatedDiameter;
            _tmpEstimatedDiameter = _cursor.getDouble(_cursorIndexOfEstimatedDiameter);
            final double _tmpRelativeVelocity;
            _tmpRelativeVelocity = _cursor.getDouble(_cursorIndexOfRelativeVelocity);
            final double _tmpDistanceFromEarth;
            _tmpDistanceFromEarth = _cursor.getDouble(_cursorIndexOfDistanceFromEarth);
            final boolean _tmpIsPotentiallyHazardous;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPotentiallyHazardous);
            _tmpIsPotentiallyHazardous = _tmp != 0;
            _item = new DatabaseAsteroid(_tmpId,_tmpCodename,_tmpCloseApproachDate,_tmpAbsoluteMagnitude,_tmpEstimatedDiameter,_tmpRelativeVelocity,_tmpDistanceFromEarth,_tmpIsPotentiallyHazardous);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<DatabaseAsteroid>> getWeekAsteroids(final String startDay,
      final String endDay) {
    final String _sql = "select * from DatabaseAsteroid where closeApproachDate between ? and ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (startDay == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, startDay);
    }
    _argIndex = 2;
    if (endDay == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, endDay);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"DatabaseAsteroid"}, false, new Callable<List<DatabaseAsteroid>>() {
      @Override
      public List<DatabaseAsteroid> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCodename = CursorUtil.getColumnIndexOrThrow(_cursor, "codename");
          final int _cursorIndexOfCloseApproachDate = CursorUtil.getColumnIndexOrThrow(_cursor, "closeApproachDate");
          final int _cursorIndexOfAbsoluteMagnitude = CursorUtil.getColumnIndexOrThrow(_cursor, "absoluteMagnitude");
          final int _cursorIndexOfEstimatedDiameter = CursorUtil.getColumnIndexOrThrow(_cursor, "estimatedDiameter");
          final int _cursorIndexOfRelativeVelocity = CursorUtil.getColumnIndexOrThrow(_cursor, "relativeVelocity");
          final int _cursorIndexOfDistanceFromEarth = CursorUtil.getColumnIndexOrThrow(_cursor, "distanceFromEarth");
          final int _cursorIndexOfIsPotentiallyHazardous = CursorUtil.getColumnIndexOrThrow(_cursor, "isPotentiallyHazardous");
          final List<DatabaseAsteroid> _result = new ArrayList<DatabaseAsteroid>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DatabaseAsteroid _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCodename;
            _tmpCodename = _cursor.getString(_cursorIndexOfCodename);
            final String _tmpCloseApproachDate;
            _tmpCloseApproachDate = _cursor.getString(_cursorIndexOfCloseApproachDate);
            final double _tmpAbsoluteMagnitude;
            _tmpAbsoluteMagnitude = _cursor.getDouble(_cursorIndexOfAbsoluteMagnitude);
            final double _tmpEstimatedDiameter;
            _tmpEstimatedDiameter = _cursor.getDouble(_cursorIndexOfEstimatedDiameter);
            final double _tmpRelativeVelocity;
            _tmpRelativeVelocity = _cursor.getDouble(_cursorIndexOfRelativeVelocity);
            final double _tmpDistanceFromEarth;
            _tmpDistanceFromEarth = _cursor.getDouble(_cursorIndexOfDistanceFromEarth);
            final boolean _tmpIsPotentiallyHazardous;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPotentiallyHazardous);
            _tmpIsPotentiallyHazardous = _tmp != 0;
            _item = new DatabaseAsteroid(_tmpId,_tmpCodename,_tmpCloseApproachDate,_tmpAbsoluteMagnitude,_tmpEstimatedDiameter,_tmpRelativeVelocity,_tmpDistanceFromEarth,_tmpIsPotentiallyHazardous);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
