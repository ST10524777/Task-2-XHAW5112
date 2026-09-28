package com.example.xhawapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// Screen 12: Contact Us & Information Request
class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        // Finding the input fields from activity_contact.xml
        val nameInput = findViewById<EditText>(R.id.input_name)
        val emailInput = findViewById<EditText>(R.id.input_email)
        val submitButton = findViewById<Button>(R.id.btn_submit_request)
        val backButton = findViewById<Button>(R.id.btn_back_home)

        // When the student clicks submit
        submitButton.setOnClickListener {
            val name = nameInput.text.toString()
            val email = emailInput.text.toString()

            // Basic if statement to check if name is empty
            if (name.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Please fill in your name and email!", Toast.LENGTH_SHORT).show()
            } else {
                // Showing a simple success message
                // Reference: https://developer.android.com/guide/topics/ui/notifiers/toasts
                Toast.makeText(this, "Thank you $name! Sarah will email you at $email.", Toast.LENGTH_LONG).show()
            }
        }

        // Just closes this screen to go back
        backButton.setOnClickListener {
            finish()
        }
    }
}
