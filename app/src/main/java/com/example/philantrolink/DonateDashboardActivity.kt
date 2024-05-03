package com.example.philantrolink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.philantrolink.databinding.ActivityDonateDashboardBinding

class DonateDashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDonateDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonateDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}



