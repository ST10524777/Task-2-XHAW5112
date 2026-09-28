package com.example.xhawapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 7: Information about the Business Management course
class BusinessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_business)

        // Find the button that was made in activity_business.xml
        val backBtn = findViewById<Button>(R.id.btn_back_from_bus)
        
        // This makes the screen close and go back when clicked
        backBtn.setOnClickListener {
            finish()
        }
    }
}