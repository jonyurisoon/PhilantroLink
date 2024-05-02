package com.example.philantrolink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.philantrolink.databinding.ActivityTermsAndConditionsBinding

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTermsAndConditionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTermsAndConditionsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}