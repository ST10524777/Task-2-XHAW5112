package com.example.xhawapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 8: Simple screen about Puppy Care
class PuppyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puppy)


        val myBackButton = findViewById<Button>(R.id.btn_back_puppy)
        


        myBackButton.setOnClickListener {
            finish()
        }
    }
}
