package com.example.healthnutritionguideapp.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.healthnutritionguideapp.R
import com.example.healthnutritionguideapp.test.meals.BreakFastActivity
import com.example.healthnutritionguideapp.test.meals.LunchActivity
import com.example.healthnutritionguideapp.test.meals.SupperActivity

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)


        val breakfast = findViewById<TextView>(R.id.breakfast)
        val lunch = this.findViewById<TextView>(R.id.lunch)
        val supper = findViewById<TextView>(R.id.supper)

        breakfast.setOnClickListener {
            startActivity(Intent(this,BreakFastActivity::class.java))
        }
        lunch.setOnClickListener {
            startActivity(Intent(this,LunchActivity::class.java))
        }
        supper.setOnClickListener {
            startActivity(Intent(this,SupperActivity::class.java))
        }
    }
}