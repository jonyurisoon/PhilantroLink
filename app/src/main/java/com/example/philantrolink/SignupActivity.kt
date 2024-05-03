package com.example.philantrolink

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.philantrolink.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Remove action bar
        // supportActionBar?.hide()

        binding.imageView.setImageResource(R.drawable.logo)

        binding.checkBox.setOnClickListener {
            val intent = Intent(this, TermsAndConditionsActivity::class.java)
            startActivity(intent)
        }
    }


    fun onLoginClicked(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)

    }

}
