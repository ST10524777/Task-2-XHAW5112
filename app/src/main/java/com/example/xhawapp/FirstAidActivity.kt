package com.example.xhawapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 9: First Aid course information
class FirstAidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

        // Student-style back button logic
        val backToDashBtn = findViewById<Button>(R.id.btn_back_first_aid)
        backToDashBtn.setOnClickListener {
            finish() // Goes back to the Dashboard
        }
    }
}
