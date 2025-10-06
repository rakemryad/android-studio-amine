package com.example.exos15092025

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button: Button = findViewById(R.id.button)
        val edittext: EditText = findViewById(R.id.editTextTextPassword)

        button.setOnClickListener {
            val motdepasse = edittext.text.toString()
            val correctpassword = "amine"
            if (motdepasse==correctpassword) {
                val intent = Intent(this, LandingPage::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Password Incorrect", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

