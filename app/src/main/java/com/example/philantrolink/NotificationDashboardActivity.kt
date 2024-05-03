package com.example.philantrolink

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.philantrolink.databinding.ActivityNotificationDashboardBinding

class NotificationDashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNotificationDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Set up the Toolbar
        setSupportActionBar(binding.NotificationToolbar)
        // Get the action bar
        val actionBar = supportActionBar
        // Set the title
        actionBar?.title = "Notifications"
        // Set title text color to white
        binding.NotificationToolbar.setTitleTextColor(Color.WHITE)
        // Enable Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Set click listener for the Up button
        binding.NotificationToolbar.setNavigationOnClickListener {
            onBackPressed()
        }

    }
}