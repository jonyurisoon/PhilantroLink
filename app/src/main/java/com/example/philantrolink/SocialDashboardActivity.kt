package com.example.philantrolink

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.philantrolink.databinding.ActivitySocialDashboardBinding

class SocialDashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySocialDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySocialDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Set up the Toolbar
        setSupportActionBar(binding.SocialToolbar)
        // Get the action bar
        val actionBar = supportActionBar
        // Set the title
        actionBar?.title = "Social"
        // Set title text color to white
        binding.SocialToolbar.setTitleTextColor(Color.WHITE)
        // Enable Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Set click listener for the Up button
        binding.SocialToolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}




