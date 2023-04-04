package com.example.healthnutritionguideapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class DiabetesType2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diabetes_type2)
    }
    fun onDiabetesType2Click(view: View) {
        val activity = null
        val intent = Intent(activity, MealPlanActivity::class.java)
        intent.putExtra("disease", "diabetes_type_2")
        startActivity(intent)
    }
}