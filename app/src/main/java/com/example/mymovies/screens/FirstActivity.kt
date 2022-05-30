package com.example.mymovies.screens


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

import com.example.mymovies.R

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        Handler().postDelayed(Runnable {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 4 * 1000
        )
    }
}