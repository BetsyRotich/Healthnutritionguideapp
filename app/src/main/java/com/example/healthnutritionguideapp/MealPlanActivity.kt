package com.example.healthnutritionguideapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MealPlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_plan)
        val disease = intent.getStringExtra("disease")

        when (disease) {
            "diabetes_type_1" -> {
                fun displayMealPlanForDiabetesType1() {
                    val mealPlan = mapOf(
                        "Breakfast" to listOf("2 slices of whole wheat toast", "1 boiled egg", "1 cup of unsweetened almond milk"),
                        "Morning Snack" to listOf("1 small apple", "1 tablespoon of peanut butter"),
                        "Lunch" to listOf("Mixed vegetable salad with grilled chicken", "1 slice of whole wheat bread", "1 small low-fat yogurt"),
                        "Afternoon Snack" to listOf("1 small banana", "1 handful of almonds"),
                        "Dinner" to listOf("Grilled salmon with roasted vegetables", "1 small sweet potato", "1 small low-fat yogurt"),
                        "Evening Snack" to listOf("Carrot sticks with hummus")
                    )

                    println("Meal Plan for Diabetes Type 1")
                    println("----------------------------\n")

                    for ((meal, items) in mealPlan) {
                        println("$meal:")
                        for (item in items) {
                            println("- $item")
                        }
                        println()
                    }
                }

            }
            "diabetes_type_2" -> {
                // display meal plan for diabetes type 2
            }
            "blood_pressure" -> {
                // display meal plan for blood pressure
            }
            "healthy_living" -> {
                // display meal plan for healthy living
            }
        }
    }

}