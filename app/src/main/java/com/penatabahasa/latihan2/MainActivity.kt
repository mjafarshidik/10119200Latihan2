package com.penatabahasa.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//24 April 2022
//10119200
//Muhammad Jafar Shidik
//IF-5

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
}