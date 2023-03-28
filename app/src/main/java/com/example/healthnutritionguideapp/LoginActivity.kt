package com.example.healthnutritionguideapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.core.view.View
import com.google.firebase.quickstart.auth.kotlin.MainActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize Firebase authentication
        auth = FirebaseAuth.getInstance()

        // Set up click listener for login button
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Authenticate user with Firebase
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        // User authenticated successfully, redirect to home activity
                        startActivity(Intent(this, MainActivity.HomeActivity::class.java))
                        finish()
                    } else {
                        // Authentication failed, show error message
                        Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content view to the login layout
        setContentView(R.layout.activity_login)

        // Check if the user is already logged in
        if (isLoggedIn()) {
            startHomeActivity()
        }
    }

fun setContentView(activityLogin: Int) {
    TODO("Not yet implemented")
}

private fun isLoggedIn(): Boolean {
        // Check if the user is already logged in
        // You can implement your own logic to check if the user is logged in
        return false
    }

    private fun startHomeActivity() {
        // Start the home activity
        val intent = Intent(this, MainActivity.HomeActivity::class.java)
        startActivity(intent)
        finish()
    }

fun finish() {
    TODO("Not yet implemented")
}

// Handle the login button click event
    fun onLoginButtonClick(view: View) {
        // Implement your login logic here
        // If the login is successful, call the startHomeActivity() function
        startHomeActivity()
    }