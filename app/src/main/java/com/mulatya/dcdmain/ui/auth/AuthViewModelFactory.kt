package com.mulatya.dcdmain.ui.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mulatya.dcdmain.data.repositories.UserRepository

@Suppress("UNCHECKED TASK")
class AuthViewModelFactory (private val repository: UserRepository) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return super.create(modelClass)
    }
}