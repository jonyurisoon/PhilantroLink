package com.example.philantrolink

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


    }
}




