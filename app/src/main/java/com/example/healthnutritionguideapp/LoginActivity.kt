package com.example.healthnutritionguideapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
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

        val loginButton = findViewById<Button>(R.id.btnSignIn)

        // Set up click listener for login button
        loginButton.setOnClickListener {
            val emailLayout : TextInputLayout= findViewById( R.id.tilEmail)
            val passwordLayout : TextInputLayout = findViewById( R.id.tilPassword)

            // Authenticate user with Firebase
            auth.signInWithEmailAndPassword(emailLayout.toString(), passwordLayout.toString())
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

    fun onCreate(savedInstanceState: Bundle?) {
        onCreate(savedInstanceState)

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
        val intent = Intent( MainActivity.HomeActivity::class.java)
        startActivity(intent)
        finish()
    }

fun Intent(activityClass: Class<MainActivity.HomeActivity>): Intent {
    TODO("Not yet implemented")
}

fun startActivity(intent: Intent) {
    TODO("Not yet implemented")
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

