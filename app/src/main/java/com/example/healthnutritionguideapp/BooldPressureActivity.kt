package com.example.healthnutritionguideapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class BloodPressureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blood_pressure)

        fun onBloodPressureClick(view: View) {
            val activity = null
            val intent = Intent(activity, MealPlanActivity::class.java)
            intent.putExtra("disease", "BloodPressure")
            startActivity(intent)
        }
    }

}