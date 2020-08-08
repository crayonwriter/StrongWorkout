package com.crayonwriter.android.mystrongworkout

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WorkoutViewmodel: ViewModel() {
    private val exercises: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>().also {
            loadExercises()
        }
    }

    fun getExercises() : LiveData<Int> {
        return exercises
    }

    fun loadExercises() {
        //fetch exercises asynchronously
    }

    //Increment reps button
    //Decrement reps button
    //save to Room database button
}

