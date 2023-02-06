package com.example.school_portal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StudentAssignmentSubmissionStatus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_assignment_submission_status)

        val submissionOpener = findViewById<Button>(R.id.button5)
        submissionOpener.setOnClickListener {
            val intent = Intent(this, StudentAssignmentSubmission::class.java)
            startActivity(intent)
        }
    }
}