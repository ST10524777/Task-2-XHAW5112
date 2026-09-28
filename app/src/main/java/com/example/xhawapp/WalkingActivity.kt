package com.example.xhawapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 10: Professional Dog Walking Skills
class WalkingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walking)

        // Find the back button from the layout
        val btnBack = findViewById<Button>(R.id.btn_back_walking)
        







        btnBack.setOnClickListener {
            finish()
        }
    }
}