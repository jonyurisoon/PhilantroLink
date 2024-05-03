package com.example.philantrolink

import android.graphics.Color
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

        // Set up the Toolbar
        setSupportActionBar(binding.DonateToolbar)
        // Get the action bar
        val actionBar = supportActionBar
        // Set the title
        actionBar?.title = "Donate"
        // Set title text color to white
        binding.DonateToolbar.setTitleTextColor(Color.WHITE)
        // Enable Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Set click listener for the Up button
        binding.DonateToolbar.setNavigationOnClickListener {
            onBackPressed()
        }

    }
}




