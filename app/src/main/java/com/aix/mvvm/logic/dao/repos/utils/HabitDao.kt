package com.aix.mvvm.logic.dao.repos.utils

import androidx.lifecycle.LiveData
import androidx.room.*
import com.aix.mvvm.data.database.models.Habit

@Dao
interface HabitDao
{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addhabit(habit:Habit)
    @Update
    suspend fun  updateHabit(habit: Habit)

    @Delete
    suspend fun deleteHabit(habit: Habit)

    @Query("SELECT * FROM habit_table ORDER BY id DESC")
    fun getAllHabits(): LiveData<List<Habit>>

    @Query("DELETE FROM habit_table")
    suspend fun deleteALL()
}