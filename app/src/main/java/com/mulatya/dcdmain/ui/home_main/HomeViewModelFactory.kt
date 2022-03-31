package com.mulatya.dcdmain.ui.home_main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mulatya.dcdmain.data.repositories.UserRepository

@Suppress("...")
class HomeViewModelFactory (private val repository: UserRepository) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HomeViewModel(repository) as T
    }
}