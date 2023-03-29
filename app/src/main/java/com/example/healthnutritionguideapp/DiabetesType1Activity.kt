package com.example.healthnutritionguideapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DiabetesType1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diabetes_type1)
    }
    fun onDiabetesType1Click(view: View) {
        val activity = null
        val intent = Intent(activity, MealPlanActivity::class.java)
        intent.putExtra("disease", "diabetes_type_1")
        startActivity(intent)
    }

}