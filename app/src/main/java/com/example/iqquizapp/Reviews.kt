package com.example.iqquizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class Reviews : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reviews)


        // Set up for animation for the background
        val LinearLayout = findViewById<LinearLayout>(R.id.main)
        val AnimationDrawable = LinearLayout.background as AnimationDrawable
        AnimationDrawable.setEnterFadeDuration(10)
        AnimationDrawable.setExitFadeDuration(2500)
        AnimationDrawable.start()

        val Review = findViewById<TextView>(R.id.Review)
        val BtnRetry = findViewById<Button>(R.id.BtnRetry)
        val BtnExit = findViewById<Button>(R.id.BtnExit)


        // extraction of the review data
        val questions = intent.getStringArrayExtra("questions")
        val answers = intent.getBooleanArrayExtra("answers")

        // StringBuilder to build the review text
        val ReviewText = StringBuilder()
        if (questions != null && answers != null && questions.size == answers.size) {
            for (i in questions.indices) {
                ReviewText.append("${i + 1}.${questions[i]}\n")
                ReviewText.append("Answer: ${if (answers[i]) "True" else "False"}\n\n")
            }
            Review.text = ReviewText.toString()
        } else {
                    Review.text = "No reviews available."
        }

        // Set click listeners for the buttons
        BtnRetry.setOnClickListener {
            val intent = Intent(this, Flashcard::class.java)
            startActivity(intent)
        }

        // Exit the app
        BtnExit.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }

    }
}