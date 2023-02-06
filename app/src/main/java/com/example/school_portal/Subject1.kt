package com.example.school_portal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Subject1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject1)

        val notesOpener = findViewById<Button>(R.id.button)
        notesOpener.setOnClickListener {
            val intent = Intent(this, StudentNotes::class.java)
            startActivity(intent)
        }

        val assignmentsOpener = findViewById<Button>(R.id.button3)
        assignmentsOpener.setOnClickListener {
            val intent2 = Intent(this, StudentAssignments::class.java)
            startActivity(intent2)
        }

        val gradesOpener = findViewById<Button>(R.id.button2)
        gradesOpener.setOnClickListener {
            val intent3 = Intent(this, StudentGrades::class.java)
            startActivity(intent3)
        }
    }
}