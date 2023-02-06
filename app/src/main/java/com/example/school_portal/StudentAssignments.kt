package com.example.school_portal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StudentAssignments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_assignments)

        val submissionOpener = findViewById<Button>(R.id.button)
        submissionOpener.setOnClickListener {
            val intent = Intent(this, StudentAssignmentSubmission::class.java)
            startActivity(intent)
        }

        val submissionOpener1 = findViewById<Button>(R.id.button3)
        submissionOpener1.setOnClickListener {
            val intent = Intent(this, StudentAssignmentSubmission::class.java)
            startActivity(intent)
        }

        val submissionOpener2 = findViewById<Button>(R.id.button2)
        submissionOpener2.setOnClickListener {
            val intent = Intent(this, StudentAssignmentSubmission::class.java)
            startActivity(intent)
        }



    }
}