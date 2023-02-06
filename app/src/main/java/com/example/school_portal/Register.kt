package com.example.school_portal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val loginOpener = findViewById<Button>(R.id.button4)
        loginOpener.setOnClickListener{
            val Intent = Intent(this,Login::class.java)
            startActivity(Intent)
        }

        val loginOpener2 = findViewById<Button>(R.id.button3)
        loginOpener2.setOnClickListener{
            val Intent2 = Intent(this,Login::class.java)
            startActivity(Intent2)
        }
    }
}