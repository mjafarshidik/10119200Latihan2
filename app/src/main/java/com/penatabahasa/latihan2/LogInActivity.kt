package com.penatabahasa.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.penatabahasa.latihan2.databinding.ActivityLogInBinding

//24 April 2022
//10119200
//Muhammad Jafar Shidik
//IF-5

class LogInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        intentToRegisterActivity()
    }

    private fun intentToRegisterActivity() {
        binding.apply {
            tvRegister.setOnClickListener {
                val intent = Intent(this@LogInActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }
}