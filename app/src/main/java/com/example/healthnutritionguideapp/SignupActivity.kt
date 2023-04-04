package com.example.healthnutritionguideapp
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {
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
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_signup)
        auth = FirebaseAuth.getInstance()
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
            if (email.isNotEmpty() && password.isNotEmpty()) {
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            val user = auth.currentUser
                            val email = emailInput.text.toString()
                            val password = passwordInput.text.toString()
                            // Sign in success, update UI with the signed-in user's information
//                        Log.d(TAG, "createUserWithEmail:success")
//                        val user = auth.currentUser
                            val intent = Intent(this, LoginActivity::class.java)
                            startActivity(intent)
                            finish()
                            
                            
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.exception)
                            Toast.makeText(
                                baseContext, "Authentication failed.",
                                Toast.LENGTH_SHORT
                            ).show()

                        }
                    }
            } else {
                Toast.makeText(
                    this,
                    "Email and password fields cannot be empty",
                    Toast.LENGTH_SHORT
                ).show()

                // Create Intent object
            }
                val loginButton = findViewById<Button>(R.id.btnlogin)

                loginButton.setOnClickListener {
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                }
            // Create Intent object


        }
    }
}



