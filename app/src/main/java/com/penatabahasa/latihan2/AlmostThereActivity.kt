package com.penatabahasa.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.penatabahasa.latihan2.databinding.ActivityAlmostThereBinding

//24 April 2022
//10119200
//Muhammad Jafar Shidik
//IF-5

class AlmostThereActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlmostThereBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmostThereBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        intentToVerifyAccount()
    }

    private fun intentToVerifyAccount() {
        binding.apply {
            btnVerify.setOnClickListener {
                val intent = Intent(this@AlmostThereActivity, VerifyAccountActivity::class.java)
                startActivity(intent)
            }
        }
    }
}