package com.example.philantrolink

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


    }
}




