package com.example.philantrolink

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.philantrolink.databinding.ActivityCharityEventBinding
import com.example.philantrolink.databinding.ActivityEventManagerDashboardBinding


class CharityEventActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCharityEventBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCharityEventBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Set up the Toolbar
        setSupportActionBar(binding.CharityEventToolbar)
        // Get the action bar
        val actionBar = supportActionBar
        // Set the title
        actionBar?.title = "Charity Event"
        // Set title text color to white
        binding.CharityEventToolbar.setTitleTextColor(Color.WHITE)
        // Enable Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Set click listener for the Up button
        binding.CharityEventToolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}