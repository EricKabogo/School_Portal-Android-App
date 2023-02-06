package com.example.school_portal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StudentAssignmentSubmission : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_assignment_submission)

        val submissionStatusOpener = findViewById<Button>(R.id.button5)
        submissionStatusOpener.setOnClickListener {
            val intent = Intent(this, StudentAssignmentSubmissionStatus::class.java)
            startActivity(intent)
        }
    }
}