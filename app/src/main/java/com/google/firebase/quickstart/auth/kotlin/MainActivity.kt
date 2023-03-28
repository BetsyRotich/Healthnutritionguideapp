package com.google.firebase.quickstart.auth.kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Check if user is already signed in
        val currentUser = FirebaseAuth.getInstance().currentUser
        if (currentUser != null) {
            // User is already signed in, redirect to home activity
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        } else {
            // User is not signed in, show sign-in activity
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }
    }

    class SignInActivity {

    }

    class HomeActivity {

    }
}




