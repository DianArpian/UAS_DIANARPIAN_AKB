package com.example.catatankeuangan.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.catatankeuangan.database.dao.DatabaseDao;
import com.example.catatankeuangan.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
