package com.example.philantrolink

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.philantrolink.databinding.ActivityFundsForCancerPatientBinding

class FundsForCancerPatientActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFundsForCancerPatientBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFundsForCancerPatientBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Set up the Toolbar
        setSupportActionBar(binding.FundsForCancerPatientToolbar)
        // Get the action bar
        val actionBar = supportActionBar
        // Set the title
        actionBar?.title = "Funds for cancer patient"
        // Set title text color to white
        binding.FundsForCancerPatientToolbar.setTitleTextColor(Color.WHITE)
        // Enable Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Set click listener for the Up button
        binding.FundsForCancerPatientToolbar.setNavigationOnClickListener {
            onBackPressed()
        }

    }
}