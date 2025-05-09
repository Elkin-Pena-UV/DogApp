package com.univalle.dogapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.univalle.dogapp.Model.Cita

@Database(entities = [Cita::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun citaDao(): CitaDao
}
