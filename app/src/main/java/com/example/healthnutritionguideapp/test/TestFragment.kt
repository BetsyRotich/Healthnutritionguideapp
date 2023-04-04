package com.example.healthnutritionguideapp.test

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.healthnutritionguideapp.R

class TestFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_test, container, false)

        val diabetesType1 = view.findViewById<LinearLayout>(R.id.testone)
        val diabetesType2 = view.findViewById<LinearLayout>(R.id.testtwo)
        val bloodPressure = view.findViewById<LinearLayout>(R.id.testthree)
        val healthyLiving = view.findViewById<LinearLayout>(R.id.testfour)

        diabetesType1.setOnClickListener {
            startActivity(Intent(context,TestActivity::class.java))
        }
        diabetesType2.setOnClickListener {
            startActivity(Intent(context,TestActivity::class.java))
        }
        bloodPressure.setOnClickListener {
            startActivity(Intent(context,TestActivity::class.java))
        }
        healthyLiving.setOnClickListener {
            startActivity(Intent(context,TestActivity::class.java))
        }

        return view
    }


}