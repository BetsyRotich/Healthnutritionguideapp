package com.example.healthnutritionguideapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DiscoverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_discover)

        // Set up click listeners for the links
        findViewById<TextView>(R.id.webmd_link).setOnClickListener { openLink(it.tag.toString()) }
        findViewById<TextView>(R.id.mayo_clinic_link).setOnClickListener { openLink(it.tag.toString()) }
        findViewById<TextView>(R.id.myfitnesspal_link).setOnClickListener { openLink(it.tag.toString()) }
        findViewById<TextView>(R.id.eat_this_link).setOnClickListener { openLink(it.tag.toString()) }
        findViewById<TextView>(R.id.ncda_link).setOnClickListener { openLink(it.tag.toString()) }
        findViewById<TextView>(R.id.lishe_link).setOnClickListener { openLink(it.tag.toString())}
        }

    // Function to open a website in a browser
    private fun openLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}
