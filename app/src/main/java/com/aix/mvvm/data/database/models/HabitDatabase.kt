package com.aix.mvvm.data.database.models

import android.content.Context
import android.os.strictmode.InstanceCountViolation
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.aix.mvvm.logic.dao.repos.utils.HabitDao

@Database(entities = [Habit::class], version = 1, exportSchema = false )
abstract class HabitDatabase: RoomDatabase()
{
    abstract fun habitDao() : HabitDao

    companion object
    {
        private var INSTANCE: HabitDatabase? = null
        fun getDatabase(context: Context): HabitDatabase
        {
            val tempInstance = INSTANCE
            if(tempInstance != null)
            {
                return tempInstance
            }
                synchronized(this)
                {
                    val instance = Room.databaseBuilder(context.applicationContext,
                    HabitDatabase:: class.java,"habit_database"
                    ).build()
                    INSTANCE = instance
                    return  instance
                }
        }
    }
}
