package com.aix.mvvm.ui.fragments.createhabit.habitlist.updatelist.`intro screen`.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.aix.mvvm.data.database.models.Habit
import com.aix.mvvm.data.database.models.HabitDatabase
import com.aix.mvvm.logic.dao.repos.utils.HabitRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HabitViewModel (application: Application): AndroidViewModel(application)
{
    private val repository: HabitRepository
    val getAllHabits: LiveData<List<Habit>>

    init
    {
        val habitDao = HabitDatabase.getDatabase(application).habitDao()
        repository = HabitRepository(habitDao)

        getAllHabits = repository.getAllHabits
    }

    fun addHabit(habit:Habit)
    {
        viewModelScope.launch { Dispatchers }
    }
}