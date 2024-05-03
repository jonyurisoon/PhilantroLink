package com.example.philantrolink

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.example.philantrolink.databinding.ActivityDashboardBinding


class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.EventManagerDash.setOnClickListener {

        }

        binding.LookForEventsDash.setOnClickListener {

        }

        binding.DonateDash.setOnClickListener {

        }

        binding.SocialDash.setOnClickListener {

        }

        binding.ProfileDash.setOnClickListener {

        }

        binding.NotificationDash.setOnClickListener {
            val intent = Intent(this, NotificationDashboardActivity::class.java)
            startActivity(intent)
        }
    }
}