package com.example.philantrolink

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.philantrolink.databinding.ActivityCharityEventDetailsBinding

class CharityEventDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCharityEventDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCharityEventDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Set up the Toolbar
        setSupportActionBar(binding.CharityEventDetailsToolbar)
        // Get the action bar
        val actionBar = supportActionBar
        // Set the title
        actionBar?.title = "Charity Event Details"
        // Set title text color to white
        binding.CharityEventDetailsToolbar.setTitleTextColor(Color.WHITE)
        // Enable Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Set click listener for the Up button
        binding.CharityEventDetailsToolbar.setNavigationOnClickListener {
            onBackPressed()
        }

    }
}