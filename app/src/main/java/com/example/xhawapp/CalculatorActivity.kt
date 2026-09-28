package com.example.xhawapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        // Student-style manual variable binding for each checkbox
        val box1 = findViewById<CheckBox>(R.id.check_c1)
        val box2 = findViewById<CheckBox>(R.id.check_c2)
        val box3 = findViewById<CheckBox>(R.id.check_c3)
        val box4 = findViewById<CheckBox>(R.id.check_c4)
        val box5 = findViewById<CheckBox>(R.id.check_c5)
        val box6 = findViewById<CheckBox>(R.id.check_c6)
        val box7 = findViewById<CheckBox>(R.id.check_c7)

        val totalText = findViewById<TextView>(R.id.txt_total_result)
        val calcBtn = findViewById<Button>(R.id.btn_calculate_now)

        calcBtn.setOnClickListener {
            var count = 0
            var price = 0.0

            // Check each box manually and add price
            if (box1.isChecked) { count++; price += 1500 }
            if (box2.isChecked) { count++; price += 1500 }
            if (box3.isChecked) { count++; price += 1500 }
            if (box4.isChecked) { count++; price += 1500 }
            if (box5.isChecked) { count++; price += 750 }
            if (box6.isChecked) { count++; price += 750 }
            if (box7.isChecked) { count++; price += 750 }

            // Decide the discount based on how many courses chosen
            var discountPercent = 0
            if (count == 2) {
                discountPercent = 5
            } else if (count == 3) {
                discountPercent = 10
            } else if (count > 3) {
                discountPercent = 15
            }

            // Simple math for the final price
            val discountAmount = price * (discountPercent / 100.0)
            val finalPrice = price - discountAmount

            // Show the result to the student
            totalText.text = "Selected: $count\nDiscount: $discountPercent%\nTotal Quote: R$finalPrice"
        }

        findViewById<Button>(R.id.btn_go_contact).setOnClickListener {
            startActivity(Intent(this, ContactActivity::class.java))
        }
    }
}