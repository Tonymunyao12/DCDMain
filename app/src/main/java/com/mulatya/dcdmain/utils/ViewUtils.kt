package com.mulatya.dcdmain.utils

import android.content.Context
import android.content.Intent
import com.mulatya.dcdmain.ui.auth.LoginActivity
import com.mulatya.dcdmain.ui.home_main.HomeActivityMain

fun Context.startHomeActivityMain()=
    Intent(this, HomeActivityMain::class.java).also {
        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(it)
    }

fun Context.startLoginActivity()=
    Intent(this, LoginActivity::class.java).also {
        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(it)
    }
