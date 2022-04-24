package com.penatabahasa.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.penatabahasa.latihan2.databinding.ActivityRegisterBinding

//24 April 2022
//10119200
//Muhammad Jafar Shidik
//IF-5

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        backToLogin()
        intentToAlmostThere()
        spinnerJobAdapter()
        spinnerBloodTypeAdapter()
        spinnerReshus()
    }

    private fun spinnerReshus() {
        binding.apply {
            ArrayAdapter.createFromResource(
                this@RegisterActivity,
                R.array.reshus,
                R.layout.color_spinner_layout
            ).also { adapter ->
                adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout)
                spnReshus.adapter = adapter
            }
        }
    }

    private fun spinnerBloodTypeAdapter() {
        binding.apply {
            ArrayAdapter.createFromResource(
                this@RegisterActivity,
                R.array.blood_type,
                R.layout.color_spinner_layout
            ).also { adapter ->
                adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout)
                spnBloodType.adapter = adapter
            }
        }
    }

    private fun spinnerJobAdapter() {
        binding.apply {
            ArrayAdapter.createFromResource(
                this@RegisterActivity,
                R.array.job,
                R.layout.color_spinner_layout
            ).also { adapter ->
                adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout)
                spnJob.adapter = adapter
            }
        }
    }

    private fun intentToAlmostThere() {
        binding.apply {
            btnRegister.setOnClickListener {
                val intent = Intent(this@RegisterActivity, AlmostThereActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun backToLogin() {
        binding.apply {
            icBack.setOnClickListener { onBackPressed() }
        }
    }


}