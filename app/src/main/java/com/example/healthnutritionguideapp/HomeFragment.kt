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

//        val diabetesType1 = view.findViewById<TextView>(R.id.DiabetesType1)
//        diabetesType1.setOnClickListener {
//            // Create buttons for breakfast, lunch, and supper
//            val breakfastButton = Button(activity)
//            breakfastButton.text = "Breakfast"
//            class DiabetesType1BreakfastFragment : Fragment() {
//
//                override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//                    // Inflate the layout for this fragment
//                    return inflater.inflate(R.layout.diabetes_type_1_breakfast_layout, container, false)
//                }
//            }
//
//            val lunchButton = Button(activity)
//            lunchButton.text = "Lunch"
//            class DiabetesType1LunchFragment : Fragment() {
//
//                override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//                    // Inflate the layout for this fragment
//                    return inflater.inflate(R.layout.diabetes_type_1_lunch_layout, container, false)
//                }
//            }
//            val supperButton = Button(activity)
//            supperButton.text = "Supper"
//            class DiabetesType1SupperFragment : Fragment() {
//
//                override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//                    // Inflate the layout for this fragment
//                    return inflater.inflate(R.layout.diabetes_type_1_supper_layout, container, false)
//                }
//            }
//
//
//        }
//
//        val diabetesType2 = view.findViewById<TextView>(R.id.DiabetesType2)
//        diabetesType2.setOnClickListener {
//            // Create buttons for breakfast, lunch, and supper
//            val breakfastButton = Button(activity)
//            breakfastButton.text = "Breakfast"
//            class DiabetesType2BreakfastFragment : Fragment() {
//
//                override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//                    // Inflate the layout for this fragment
//                    return inflater.inflate(R.layout.diabetes_type_2_breakfast_layout, container, false)
//                }
//            }
//            val lunchButton = Button(activity)
//            lunchButton.text = "Lunch"
//            class DiabetesType2LunchFragment : Fragment() {
//
//                override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//                    // Inflate the layout for this fragment
//                    return inflater.inflate(R.layout.diabetes_type_2_lunch_layout, container, false)
//                }
//            }
//            val supperButton = Button(activity)
//            supperButton.text = "Supper"
//            class DiabetesType2SupperFragment : Fragment() {
//
//                override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//                    // Inflate the layout for this fragment
//                    return inflater.inflate(R.layout.diabetes_type_2_supper_layout, container, false)
//                }
//            }
//
//            // Create a layout for the buttons
//            val buttonLayout = LinearLayout(activity)
//            buttonLayout.orientation = LinearLayout.VERTICAL
//            buttonLayout.addView(breakfastButton)
//            buttonLayout.addView(lunchButton)
//            buttonLayout.addView(supperButton)
//
//            // Display the layout with the buttons in a dialog
//            val builder = AlertDialog.Builder(activity)
//            builder.setView(buttonLayout)
//            val dialog = builder.create()
//            dialog.show()
//            breakfastButton.setOnClickListener {
//                val fragment = DiabetesType2BreakfastFragment()
//                val transaction = fragmentManager?.beginTransaction()
//                transaction?.replace(R.id.fragment_container, fragment)
//                transaction?.addToBackStack(null)
//                transaction?.commit()
//                dialog.dismiss()
//            }
//
//            lunchButton.setOnClickListener {
//                val fragment = DiabetesType2LunchFragment()
//                val transaction = fragmentManager?.beginTransaction()
//                transaction?.replace(R.id.fragment_container, fragment)
//                transaction?.addToBackStack(null)
//                transaction?.commit()
//                dialog.dismiss()
//            }
//
//            supperButton.setOnClickListener {
//                val fragment = DiabetesType2SupperFragment()
//                val transaction = fragmentManager?.beginTransaction()
//                transaction?.replace(R.id.fragment_container, fragment)
//                transaction?.addToBackStack(null)
//                transaction?.commit()
//                dialog.dismiss()
//            }
//        }
//
//
//        val bloodPressure = view.findViewById<TextView>(R.id.BloodPressure)
//        bloodPressure.setOnClickListener {
//            // Create buttons for breakfast, lunch, and supper
//            val breakfastButton = Button(activity)
//            breakfastButton.text = "Breakfast"
//            class BloodPressureBreakfastFragment : Fragment() {
//
//                override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//                    // Inflate the layout for this fragment
//                    return inflater.inflate(R.layout.blood_pressure_breakfast_layout, container, false)
//                }
//            }
//            val lunchButton = Button(activity)
//            lunchButton.text = "Lunch"
//            class BloodPressureLunchFragment : Fragment() {
//
//                override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//                    // Inflate the layout for this fragment
//                    return inflater.inflate(R.layout.blood_pressure_lunch_layout, container, false)
//                }
//            }
//            val supperButton = Button(activity)
//            supperButton.text = "Supper"
//            class BloodPressureSupperFragment : Fragment() {
//
//                override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//                    // Inflate the layout for this fragment
//                    return inflater.inflate(R.layout.blood_pressure_supper_layout, container, false)
//                }
//            }
//
//            // Create a layout for the buttons
//            val buttonLayout = LinearLayout(activity)
//            buttonLayout.orientation = LinearLayout.VERTICAL
//            buttonLayout.addView(breakfastButton)
//            buttonLayout.addView(lunchButton)
//            buttonLayout.addView(supperButton)
//
//            // Display the layout with the buttons in a dialog
//            val builder = AlertDialog.Builder(activity)
//            builder.setView(buttonLayout)
//            val dialog = builder.create()
//            dialog.show()
//            breakfastButton.setOnClickListener {
//                val fragment = BloodPressureBreakfastFragment()
//                val transaction = fragmentManager?.beginTransaction()
//                transaction?.replace(R.id.fragment_container, fragment)
//                transaction?.addToBackStack(null)
//                transaction?.commit()
//                dialog.dismiss()
//            }
//
//            lunchButton.setOnClickListener {
//                val fragment = BloodPressureLunchFragment()
//                val transaction = fragmentManager?.beginTransaction()
//                transaction?.replace(R.id.fragment_container, fragment)
//                transaction?.addToBackStack(null)
//                transaction?.commit()
//                dialog.dismiss()
//            }
//
//            supperButton.setOnClickListener {
//                val fragment = BloodPressureSupperFragment()
//                val transaction = fragmentManager?.beginTransaction()
//                transaction?.replace(R.id.fragment_container, fragment)
//                transaction?.addToBackStack(null)
//                transaction?.commit()
//                dialog.dismiss()
//            }
//        }
//
//
//        val healthyLiving = view.findViewById<TextView>(R.id.HealthyLiving)
//        healthyLiving.setOnClickListener {
//            // Create buttons for breakfast, lunch, and supper
//            val breakfastButton = Button(activity)
//            breakfastButton.text = "Breakfast"
//            class HealthyLivingBreakfastFragment : Fragment() {
//
//                override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//                    // Inflate the layout for this fragment
//                    return inflater.inflate(R.layout.healthy_living_breakfast_layout, container, false)
//                }
//            }
//            val lunchButton = Button(activity)
//            lunchButton.text = "Lunch"
//            class HealthyLivingLunchFragment : Fragment() {
//
//                override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//                    // Inflate the layout for this fragment
//                    return inflater.inflate(R.layout.healthy_living_lunch_layout, container, false)
//                }
//            }
//            val supperButton = Button(activity)
//            supperButton.text = "Supper"
//            class HealthyLivingSupperFragment : Fragment() {
//
//                override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//                    // Inflate the layout for this fragment
//                    return inflater.inflate(R.layout.healthy_living_supper_layout, container, false)
//                }
//            }
//
//            // Create a layout for the buttons
//            val buttonLayout = LinearLayout(activity)
//            buttonLayout.orientation = LinearLayout.VERTICAL
//            buttonLayout.addView(breakfastButton)
//            buttonLayout.addView(lunchButton)
//            buttonLayout.addView(supperButton)
//            // Display the layout with the buttons in a dialog
//            val builder = AlertDialog.Builder(activity)
//            builder.setView(buttonLayout)
//            val dialog = builder.create()
//            dialog.show()
//            breakfastButton.setOnClickListener {
//                val fragment = HealthyLivingBreakfastFragment()
//                val transaction = fragmentManager?.beginTransaction()
//                transaction?.replace(R.id.fragment_container, fragment)
//                transaction?.addToBackStack(null)
//                transaction?.commit()
//                dialog.dismiss()
//            }
//
//            lunchButton.setOnClickListener {
//                val fragment = HealthyLivingLunchFragment()
//                val transaction = fragmentManager?.beginTransaction()
//                transaction?.replace(R.id.fragment_container, fragment)
//                transaction?.addToBackStack(null)
//                transaction?.commit()
//                dialog.dismiss()
//            }
//
//            supperButton.setOnClickListener {
//                val fragment = HealthyLivingSupperFragment()
//                val transaction = fragmentManager?.beginTransaction()
//                transaction?.replace(R.id.fragment_container, fragment)
//                transaction?.addToBackStack(null)
//                transaction?.commit()
//                dialog.dismiss()
//            }
//        }
        return view
    }
        }









