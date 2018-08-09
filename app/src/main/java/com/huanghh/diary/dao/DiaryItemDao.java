package com.huanghh.diary.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.huanghh.diary.mvp.model.DiaryItem;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DIARY_ITEM".
*/
public class DiaryItemDao extends AbstractDao<DiaryItem, Long> {

    public static final String TABLENAME = "DIARY_ITEM";

    /**
     * Properties of entity DiaryItem.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Content = new Property(2, String.class, "content", false, "CONTENT");
        public final static Property Date = new Property(3, String.class, "date", false, "DATE");
        public final static Property Weather = new Property(4, String.class, "weather", false, "WEATHER");
        public final static Property Location = new Property(5, String.class, "location", false, "LOCATION");
        public final static Property Pics = new Property(6, String.class, "pics", false, "PICS");
        public final static Property IsPublic = new Property(7, boolean.class, "isPublic", false, "IS_PUBLIC");
        public final static Property LocalType = new Property(8, int.class, "localType", false, "LOCAL_TYPE");
    }


    public DiaryItemDao(DaoConfig config) {
        super(config);
    }
    
    public DiaryItemDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DIARY_ITEM\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TITLE\" TEXT," + // 1: title
                "\"CONTENT\" TEXT," + // 2: content
                "\"DATE\" TEXT," + // 3: date
                "\"WEATHER\" TEXT," + // 4: weather
                "\"LOCATION\" TEXT," + // 5: location
                "\"PICS\" TEXT," + // 6: pics
                "\"IS_PUBLIC\" INTEGER NOT NULL ," + // 7: isPublic
                "\"LOCAL_TYPE\" INTEGER NOT NULL );"); // 8: localType
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DIARY_ITEM\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DiaryItem entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(3, content);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(4, date);
        }
 
        String weather = entity.getWeather();
        if (weather != null) {
            stmt.bindString(5, weather);
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(6, location);
        }
 
        String pics = entity.getPics();
        if (pics != null) {
            stmt.bindString(7, pics);
        }
        stmt.bindLong(8, entity.getIsPublic() ? 1L: 0L);
        stmt.bindLong(9, entity.getLocalType());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DiaryItem entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(3, content);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(4, date);
        }
 
        String weather = entity.getWeather();
        if (weather != null) {
            stmt.bindString(5, weather);
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(6, location);
        }
 
        String pics = entity.getPics();
        if (pics != null) {
            stmt.bindString(7, pics);
        }
        stmt.bindLong(8, entity.getIsPublic() ? 1L: 0L);
        stmt.bindLong(9, entity.getLocalType());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public DiaryItem readEntity(Cursor cursor, int offset) {
        DiaryItem entity = new DiaryItem( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // content
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // date
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // weather
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // location
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // pics
            cursor.getShort(offset + 7) != 0, // isPublic
            cursor.getInt(offset + 8) // localType
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DiaryItem entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setContent(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDate(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setWeather(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setLocation(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPics(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setIsPublic(cursor.getShort(offset + 7) != 0);
        entity.setLocalType(cursor.getInt(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DiaryItem entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DiaryItem entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DiaryItem entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
