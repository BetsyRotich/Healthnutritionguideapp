package com.example.healthnutritionguideapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.healthnutritionguideapp.R
import com.example.healthnutritionguideapp.SecondActivity


class view {

}

private fun Any.setOnClickListener(function: (view) -> Unit) {

}

class HomeFragment : Fragment() {


    private fun <T> findViewById(diabetesType1: Any) {

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        val diabetesType1= findViewById<TextView>(R.id.DiabetesType1)
        diabetesType1.setOnClickListener{it;view}
        val diabetesType2= findViewById<TextView>(R.id.DiabetesType2)
        diabetesType2.setOnClickListener{it;view}
        val bloodPressure= findViewById<TextView>(R.id.BloodPressure)
        bloodPressure.setOnClickListener{it;view}


        return view

    }




}