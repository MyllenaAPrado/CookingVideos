package com.example.cookingvideos.initialscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class InitialScreenViewModel : ViewModel() {


}

class InitialScreenViewModelFactory(): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(InitialScreenViewModel::class.java))
            return InitialScreenViewModel() as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}