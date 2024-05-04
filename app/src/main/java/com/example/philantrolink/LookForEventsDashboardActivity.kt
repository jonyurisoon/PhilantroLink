package com.example.philantrolink

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.philantrolink.databinding.ActivityLookForEventsDashboardBinding

class LookForEventsDashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLookForEventsDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLookForEventsDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Set up the Toolbar
        setSupportActionBar(binding.LookForEventToolbar)
        // Get the action bar
        val actionBar = supportActionBar
        // Set the title
        actionBar?.title = "Look for Events"
        // Set title text color to white
        binding.LookForEventToolbar.setTitleTextColor(Color.WHITE)
        // Enable Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Set click listener for the Up button
        binding.LookForEventToolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        binding.CharityEvent.setOnClickListener {
            val intent = Intent(this, CharityEventActivity::class.java)
            startActivity(intent)
        }
    }
}




