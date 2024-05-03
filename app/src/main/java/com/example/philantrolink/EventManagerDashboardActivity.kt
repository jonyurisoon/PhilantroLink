package com.example.philantrolink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.philantrolink.databinding.ActivityEventManagerDashboardBinding

class EventManagerDashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEventManagerDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventManagerDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}




