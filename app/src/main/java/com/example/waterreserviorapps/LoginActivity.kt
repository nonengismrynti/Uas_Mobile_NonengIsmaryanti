package com.example.waterreserviorapps

import android.content.Intent
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.waterreserviorapps.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.btnLogin.setOnClickListener {
            val email = binding.email.text.toString()
            val password = binding.password.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()){

                firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful){
                        val intent = Intent (this, HomeActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Akun tidak terdaftar", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnSignup.setOnClickListener {
            val signupIntent = Intent(this, RegisterActivity::class.java)
            startActivity(signupIntent)
        }

        val checkboxCircle = findViewById<CheckBox>(R.id.checkboxCircle)

        checkboxCircle.setOnCheckedChangeListener { _, isChecked ->
            // Handle perubahan status checkbox di sini
            if (isChecked) {
                // Checkbox dicentang
                // Lakukan sesuatu...
            } else {
                // Checkbox tidak dicentang
                // Lakukan sesuatu...
            }
        }
    }

}