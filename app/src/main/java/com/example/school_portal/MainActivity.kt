package com.example.school_portal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginOpener = findViewById<Button>(R.id.button2)
        loginOpener.setOnClickListener{
            val Intent = Intent(this,Login::class.java)
            startActivity(Intent)
        }
        val registerOpener = findViewById<Button>(R.id.button)
        registerOpener.setOnClickListener{
            val Intent2 = Intent(this,Register::class.java)
            startActivity(Intent2)
        }
    }
}