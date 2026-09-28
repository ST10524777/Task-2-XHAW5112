package com.example.xhawapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 5: All about Pet Grooming
class GroomingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grooming)

        // Find the back button and make it close this screen
        val backBtn = findViewById<Button>(R.id.btn_back_dashboard)
        backBtn.setOnClickListener {
            finish() // This takes you back to the Dashboard
        }
    }
}