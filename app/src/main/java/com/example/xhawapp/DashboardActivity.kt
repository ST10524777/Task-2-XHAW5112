package com.example.xhawapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Screen 3: The main menu where users choose a course
class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // I linked every button to open every screen
        // I used descriptive IDs so I don't get confused.
        
        // 6-Month Course Buttons
        findViewById<Button>(R.id.btn_course_1).setOnClickListener { 
            val intent1 = Intent(this, ObedienceActivity::class.java)
            startActivity(intent1) 
        }
        
        findViewById<Button>(R.id.btn_course_2).setOnClickListener { 
            val intent2 = Intent(this, GroomingActivity::class.java)
            startActivity(intent2) 
        }
        
        findViewById<Button>(R.id.btn_course_3).setOnClickListener { 
            val intent3 = Intent(this, BehaviourActivity::class.java)
            startActivity(intent3) 
        }
        
        findViewById<Button>(R.id.btn_course_4).setOnClickListener { 
            val intent4 = Intent(this, BusinessActivity::class.java)
            startActivity(intent4) 
        }

        // 6-Week Short Course Buttons
        findViewById<Button>(R.id.btn_course_5).setOnClickListener { 
            val intent5 = Intent(this, PuppyActivity::class.java)
            startActivity(intent5) 
        }
        
        findViewById<Button>(R.id.btn_course_6).setOnClickListener { 
            val intent6 = Intent(this, FirstAidActivity::class.java)
            startActivity(intent6) 
        }
        
        findViewById<Button>(R.id.btn_course_7).setOnClickListener { 
            val intent7 = Intent(this, WalkingActivity::class.java)
            startActivity(intent7) 
        }

        // This button goes to the Calculator screen
        findViewById<Button>(R.id.btn_go_to_calc).setOnClickListener {
            val calcIntent = Intent(this, CalculatorActivity::class.java)
            startActivity(calcIntent)
        }
        
        // Reference: I learned how to move between activities using Intents here:
        // https://developer.android.com/training/basics/firstapp/starting-activity
    }
}