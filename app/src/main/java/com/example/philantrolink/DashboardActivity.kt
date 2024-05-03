package com.example.philantrolink

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager

import androidx.appcompat.app.AppCompatActivity

import com.example.philantrolink.databinding.ActivityDashboardBinding


class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Remove action bar
        // supportActionBar?.hide()

        binding.EventManagerDash.setOnClickListener {
            val intent = Intent(this, EventManagerDashboardActivity::class.java)
            startActivity(intent)
        }

        binding.LookForEventsDash.setOnClickListener {
            val intent = Intent(this, LookForEventsDashboardActivity::class.java)
            startActivity(intent)
        }

        binding.DonateDash.setOnClickListener {
            val intent = Intent(this, DonateDashboardActivity::class.java)
            startActivity(intent)
        }

        binding.SocialDash.setOnClickListener {
            val intent = Intent(this, SocialDashboardActivity::class.java)
            startActivity(intent)
        }

        binding.ProfileDash.setOnClickListener {
            val intent = Intent(this, ProfileDashboardActivity::class.java)
            startActivity(intent)
        }

        binding.NotificationDash.setOnClickListener {
            val intent = Intent(this, NotificationDashboardActivity::class.java)
            startActivity(intent)
        }
    }
}