package com.mulatya.dcdmain.ui.home_main

import android.view.View
import androidx.lifecycle.ViewModel
import com.mulatya.dcdmain.data.repositories.UserRepository
import com.mulatya.dcdmain.utils.startLoginActivity

class HomeViewModel(private val repository: UserRepository): ViewModel() {

    val  user by lazy {
        repository.currentUser()
    }

    fun logout(view:View){
        repository.logout()
        view.context.startLoginActivity()
    }
}