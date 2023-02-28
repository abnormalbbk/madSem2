package com.example.myapplication.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = User.class, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase instance;

    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context,
                            AppDatabase.class,
                            "my_app_database")
                    .build();
        }
        return instance;
    }

    public abstract UserDao userDao();
}


