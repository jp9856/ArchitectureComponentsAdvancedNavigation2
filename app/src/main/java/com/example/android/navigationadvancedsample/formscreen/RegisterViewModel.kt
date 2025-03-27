package com.example.android.navigationadvancedsample.formscreen

import androidx.lifecycle.ViewModel

class RegisterViewModel: ViewModel() {
    init {
        println("register view model created")
    }

    override fun onCleared() {
        super.onCleared()
        println("register view model destroyed")
    }

    fun test() {
        println("testing")
    }
}