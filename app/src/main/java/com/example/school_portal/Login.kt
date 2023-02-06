package com.example.school_portal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val teacherHomepageOpener = findViewById<Button>(R.id.button3)
        teacherHomepageOpener.setOnClickListener{
            val Intent = Intent(this,TeacherHomepage::class.java)
            startActivity(Intent)
        }
    }
}