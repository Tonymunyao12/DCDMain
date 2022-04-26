/*
* Copyright 2020 BlessedCoders
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
* */

package com.mulatya.dcdmain.ui.auth


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mulatya.dcdmain.MainActivity
import com.mulatya.dcdmain.R
import com.mulatya.dcdmain.ui.home_main.HomeActivityMain


class SignupActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

//
        val navHomeMain: Button = findViewById(R.id.signup_button)
        navHomeMain.setOnClickListener {
            val intent = Intent(this, HomeActivityMain::class.java)
            startActivity(intent)
        }

// TODO ("making part of a string clickable")
        val navLogin: TextView = findViewById(R.id.navigate_login)
        navLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }


}