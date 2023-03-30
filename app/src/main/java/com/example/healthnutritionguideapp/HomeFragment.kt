package com.example.healthnutritionguideapp

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val diabetesType1 = view.findViewById<TextView>(R.id.DiabetesType1)
        diabetesType1.setOnClickListener {
            // Create buttons for breakfast, lunch, and supper
            val breakfastButton = Button(activity)
            breakfastButton.text = "Breakfast"
            val lunchButton = Button(activity)
            lunchButton.text = "Lunch"
            val supperButton = Button(activity)
            supperButton.text = "Supper"

            // Create a layout for the buttons
            val buttonLayout = LinearLayout(activity)
            buttonLayout.orientation = LinearLayout.VERTICAL
            buttonLayout.addView(breakfastButton)
            buttonLayout.addView(lunchButton)
            buttonLayout.addView(supperButton)

            // Display the layout with the buttons in a dialog
            val builder = AlertDialog.Builder(activity)
            builder.setView(buttonLayout)
            val dialog = builder.create()
            dialog.show()
        }

        val diabetesType2 = view.findViewById<TextView>(R.id.DiabetesType2)
        diabetesType2.setOnClickListener {
            // Create buttons for breakfast, lunch, and supper
            val breakfastButton = Button(activity)
            breakfastButton.text = "Breakfast"
            val lunchButton = Button(activity)
            lunchButton.text = "Lunch"
            val supperButton = Button(activity)
            supperButton.text = "Supper"

            // Create a layout for the buttons
            val buttonLayout = LinearLayout(activity)
            buttonLayout.orientation = LinearLayout.VERTICAL
            buttonLayout.addView(breakfastButton)
            buttonLayout.addView(lunchButton)
            buttonLayout.addView(supperButton)

            // Display the layout with the buttons in a dialog
            val builder = AlertDialog.Builder(activity)
            builder.setView(buttonLayout)
            val dialog = builder.create()
            dialog.show()
        }

        val bloodPressure = view.findViewById<TextView>(R.id.BloodPressure)
        bloodPressure.setOnClickListener {
            // Create buttons for breakfast, lunch, and supper
            val breakfastButton = Button(activity)
            breakfastButton.text = "Breakfast"
            val lunchButton = Button(activity)
            lunchButton.text = "Lunch"
            val supperButton = Button(activity)
            supperButton.text = "Supper"

            // Create a layout for the buttons
            val buttonLayout = LinearLayout(activity)
            buttonLayout.orientation = LinearLayout.VERTICAL
            buttonLayout.addView(breakfastButton)
            buttonLayout.addView(lunchButton)
            buttonLayout.addView(supperButton)

            // Display the layout with the buttons in a dialog
            val builder = AlertDialog.Builder(activity)
            builder.setView(buttonLayout)
            val dialog = builder.create()
            dialog.show()
        }

        val healthyLiving = view.findViewById<TextView>(R.id.HealthyLiving)
        healthyLiving.setOnClickListener {
            // Create buttons for breakfast, lunch, and supper
            val breakfastButton = Button(activity)
            breakfastButton.text = "Breakfast"
            val lunchButton = Button(activity)
            lunchButton.text = "Lunch"
            val supperButton = Button(activity)
            supperButton.text = "Supper"

            // Create a layout for the buttons
            val buttonLayout = LinearLayout(activity)
            buttonLayout.orientation = LinearLayout.VERTICAL
            buttonLayout.addView(breakfastButton)
            buttonLayout.addView(lunchButton)
            buttonLayout.addView(supperButton)
            // Display the layout with the buttons in a dialog
            val builder = AlertDialog.Builder(activity)
            builder.setView(buttonLayout)
            val dialog = builder.create()
            dialog.show()
        }
        return view
    }
        }









