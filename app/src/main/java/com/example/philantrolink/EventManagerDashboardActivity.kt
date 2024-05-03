package com.example.philantrolink

import android.graphics.Color
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

        // Set up the Toolbar
        setSupportActionBar(binding.EventManagerToolbar)
        // Get the action bar
        val actionBar = supportActionBar
        // Set the title
        actionBar?.title = "Event Manager"
        // Set title text color to white
        binding.EventManagerToolbar.setTitleTextColor(Color.WHITE)
        // Enable Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Set click listener for the Up button
        binding.EventManagerToolbar.setNavigationOnClickListener {
            onBackPressed()
        }

    }
}




