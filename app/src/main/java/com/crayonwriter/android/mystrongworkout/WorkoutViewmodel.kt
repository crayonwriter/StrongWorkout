package com.crayonwriter.android.mystrongworkout

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WorkoutViewmodel: ViewModel() {
    private val exercises: MutableLiveData<List<Exercise>> by lazy {
        MutableLiveData().also {
            loadExercises()
        }
    }

    fun getExercises() : LiveData<List<Exercise>> {
        return exercises
    }

    fun loadExercises() {
        //fetch exercises aysynchronously
    }
}