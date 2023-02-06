package com.example.school_portal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StudentHomepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_homepage)

        val notesOpener = findViewById<Button>(R.id.button8)
        notesOpener.setOnClickListener {
            val intent = Intent(this, Subject1::class.java)
            startActivity(intent)
        }

        val assignmentsOpener = findViewById<Button>(R.id.button9)
        assignmentsOpener.setOnClickListener {
            val intent2 = Intent(this, Subject1::class.java)
            startActivity(intent2)
        }

        val gradesOpener = findViewById<Button>(R.id.button10)
        gradesOpener.setOnClickListener {
            val intent3 = Intent(this, Subject1::class.java)
            startActivity(intent3)
        }
    }
}