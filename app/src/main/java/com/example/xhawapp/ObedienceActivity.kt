package com.example.xhawapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 4: Canine Obedience Training detail screen
class ObedienceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use its own unique xml file
        setContentView(R.layout.activity_obedience)

        // Simple student-like button logic
        val backButton = findViewById<Button>(R.id.btn_back_dash)
        backButton.setOnClickListener {
            finish() // Just closes this screen and goes back
        }
    }
}