package com.example.EasyCart.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.EasyCart.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actitivty_login_register)
    }
}