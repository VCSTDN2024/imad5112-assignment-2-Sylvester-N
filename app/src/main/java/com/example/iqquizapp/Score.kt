package com.example.iqquizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
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

class Score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score)

        //Background Animation
        val LinearLayout = findViewById<LinearLayout>(R.id.main)
        val AnimationDrawable = LinearLayout.background as AnimationDrawable
        AnimationDrawable.setEnterFadeDuration(10)
        AnimationDrawable.setExitFadeDuration(2500)
        AnimationDrawable.start()

        val score = findViewById<TextView>(R.id.Score)
        val feedback = findViewById<TextView>(R.id.Feedback)
        val BtnReview = findViewById<Button>(R.id.BtnReview)
        val BtnExit = findViewById<Button>(R.id.BtnExit)

        //Get Score from Quiz
        val Score = intent.getIntExtra("score", 0)
            score.text = "Your Score: $Score/5"

        //Feedback
        val Feedback = if (Score >= 3) {
                "Congratulations! You passed the quiz."
        } else {
                "Sorry, you failed the quiz."
                }
        feedback.text = Feedback

        //Review Button
        BtnReview.setOnClickListener {
                val intent = Intent(this, Reviews::class.java)
                intent.putExtra("questions", Flashcard.questions)
                intent.putExtra("answers", Flashcard.answers)
                startActivity(intent)
        }

        //Exit Button
        BtnExit.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }
    }
}