package com.example.healthnutritionguideapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth

    private lateinit var emailInput: EditText
    private lateinit var firstNameInput: EditText
    private lateinit var lastNameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var confirmPasswordInput: EditText
    private lateinit var emailInputLayout: TextInputLayout
    private lateinit var firstNameInputLayout: TextInputLayout
    private lateinit var lastNameInputLayout: TextInputLayout
    private lateinit var passwordInputLayout: TextInputLayout
    private lateinit var confirmPasswordInputLayout: TextInputLayout
    private lateinit var signUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_signup)

        firebaseAuth = FirebaseAuth.getInstance()

        emailInput = findViewById(R.id.etEmaill)
        firstNameInput = findViewById(R.id.etfullname)
        lastNameInput = findViewById(R.id.etPasswordd)
        passwordInput = findViewById(R.id.etPassworddtwo)
        confirmPasswordInput = findViewById(R.id.etPasswordthree)
        emailInputLayout = findViewById(R.id.tilEmail)
        firstNameInputLayout = findViewById(R.id.tilfullname)
        lastNameInputLayout = findViewById(R.id.tilPassword)
        passwordInputLayout = findViewById(R.id.tilPasswordtwo)
        confirmPasswordInputLayout = findViewById(R.id.tilPasswordthree)
        signUpButton = findViewById(R.id.btnSignup)

        signUpButton.setOnClickListener {
            val email = emailInput.text.toString().trim()
            val firstName = firstNameInput.text.toString().trim()
            val lastName = lastNameInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()
            val confirmPassword = confirmPasswordInput.text.toString().trim()
            val loginButton = findViewById<Button>(R.id.btnlogin)

            loginButton.setOnClickListener {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }

            if (email.isEmpty()) {
                emailInputLayout.error = "Email is required"
            } else {
                emailInputLayout.error = null
            }

            if (firstName.isEmpty()) {
                firstNameInputLayout.error = "First name is required"
            } else {
                firstNameInputLayout.error = null
            }

            if (lastName.isEmpty()) {
                lastNameInputLayout.error = "Last name is required"
            } else {
                lastNameInputLayout.error = null
            }

            if (password.isEmpty()) {
                passwordInputLayout.error = "Password is required"
            } else {
                passwordInputLayout.error = null
            }

            if (confirmPassword.isEmpty()) {
                confirmPasswordInputLayout.error = "Please confirm your password"
            } else {
                confirmPasswordInputLayout.error = null
            }

            if (password != confirmPassword) {
                confirmPasswordInputLayout.error = "Passwords do not match"
            } else {
                confirmPasswordInputLayout.error = null
            }
                // Perform signup logic here...
            }
        }
    }

