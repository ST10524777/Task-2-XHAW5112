package com.example.xhawapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// This is the first screen that opens when you start the app
class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Find the button by its unique student ID
        val startButton = findViewById<Button>(R.id.btn_start_journey)

        // Set a listener to detect when the user clicks the button
        startButton.setOnClickListener {
            // Create an Intent to go from this screen to the About screen to swap between them
            // Sourced from: https://developer.android.com/training/basics/firstapp/starting-activity
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}