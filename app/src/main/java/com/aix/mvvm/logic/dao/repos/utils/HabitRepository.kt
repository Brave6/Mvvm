package com.aix.mvvm.logic.dao.repos.utils

import androidx.lifecycle.LiveData
import com.aix.mvvm.data.database.models.Habit

class HabitRepository(private val habitDao: HabitDao)
{
    val getAllHabits: LiveData<List<Habit>> = habitDao.getAllHabits()

    suspend fun addHabit(habit: Habit)
    {
        habitDao.addhabit(habit)
    }

    suspend fun updateHabit(habit: Habit)
    {
        habitDao.updateHabit(habit)
    }

    suspend fun deleteHabit(habit: Habit)
    {
        habitDao.deleteHabit(habit)
    }

    suspend fun deleteAllHabits(habit: Habit)
    {
        habitDao.deleteALL()
    }
}