package com.example.healthnutritionguideapp

import android.app.Activity
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    private lateinit var profileImageView: ImageView
    private lateinit var weightInput: EditText
    private lateinit var heightInput: EditText
    private lateinit var bmiResultTextView: TextView

    private val pickImage = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            result.data?.data?.also { uri ->
                val inputStream = contentResolver.openInputStream(uri)
                val selectedImage = BitmapFactory.decodeStream(inputStream)
                profileImageView.setImageBitmap(selectedImage)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_profile)

        profileImageView = findViewById(R.id.profilepicture)
        weightInput = findViewById(R.id.weight_input)
        heightInput = findViewById(R.id.height_input)
        bmiResultTextView = findViewById(R.id.bmi_result)

        val calculateBMIButton: Button = findViewById(R.id.calculate_bmi_button)
        calculateBMIButton.setOnClickListener {
            val weight = weightInput.text.toString().toFloatOrNull() ?: 0f
            val height = heightInput.text.toString().toFloatOrNull() ?: 0f
            val bmi = calculateBMI(weight, height)
            bmiResultTextView.text = "BMI: $bmi"
        }

    }

    private fun calculateBMI(weight: Float, height: Float): Float {
        val heightInCentimeters = height / 100
        return weight / (heightInCentimeters * heightInCentimeters)
    }
}


