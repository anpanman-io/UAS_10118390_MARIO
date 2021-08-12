package com.jovanovic.stefan.mytestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


// 11-08-2021 - Mario Gonzaga Muharjani - 10118390


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }
}