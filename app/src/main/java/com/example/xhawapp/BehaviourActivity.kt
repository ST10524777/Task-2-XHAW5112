package com.example.xhawapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 6: Details for Animal Behaviour Course
class BehaviourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_behaviour)

        // Sourced from: https://developer.android.com/reference/android/app/Activity#finish()
        // This button just takes the student back to the dashboard
        val goBackBtn = findViewById<Button>(R.id.btn_back_from_beh)
        goBackBtn.setOnClickListener {
            finish() 
        }
    }
}