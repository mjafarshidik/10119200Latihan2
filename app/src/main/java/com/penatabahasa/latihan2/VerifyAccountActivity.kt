package com.penatabahasa.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.penatabahasa.latihan2.databinding.ActivityVerifyAccountBinding

//24 April 2022
//10119200
//Muhammad Jafar Shidik
//IF-5

class VerifyAccountActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerifyAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerifyAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        intentToHome()
    }

    private fun intentToHome() {
        binding.apply {
            btnSend.setOnClickListener {
                val intent = Intent(this@VerifyAccountActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}