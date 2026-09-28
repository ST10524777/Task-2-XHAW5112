package com.example.xhawapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val nextBtn = findViewById<Button>(R.id.btn_go_dashboard)
        nextBtn.setOnClickListener {
            // Intent used to swap to the Dashboard screen
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
    }
}