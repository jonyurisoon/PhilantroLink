package com.example.philantrolink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.philantrolink.databinding.ActivityNotificationDashboardBinding

class NotificationDashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNotificationDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationDashboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}