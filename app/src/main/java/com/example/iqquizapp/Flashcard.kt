package com.example.iqquizapp

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

class Flashcard : AppCompatActivity() {

    // Declare the views
    private lateinit var QuizQuestion: TextView
    private lateinit var Feedback: TextView

    // Declare the buttons
    private lateinit var BtnFalse: Button
    private lateinit var BtnTrue: Button
    private lateinit var BtnNext: Button


    // Companion object to hold the questions, answers, and current question index
    companion object {
        val questions = arrayOf(
            "Question 1: \n \n All prime numbers are odd.",
            "Question 2: \n \nIf two angles of a triangle are 60° each, the third angle must be 60°. ",
            "Question 3: \n \nIn English, the words \"listen\" and \"silent\" contain exactly the same letters.",
            "Question 4: \n \nWater boils at 90 degrees Celsius at standard atmospheric pressure.",
            "Question 5: \n \nThe chemical symbol for gold is \"Ag\"."
        )
        val answers = booleanArrayOf(false, true, true, false, false)

        private var currentQuestionIndex = 0
        private var score = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flashcard)

        //background animation
        val LinearLayout = findViewById<LinearLayout>(R.id.main)
        val AnimationDrawable = LinearLayout.background as AnimationDrawable
        AnimationDrawable.setEnterFadeDuration(10)
        AnimationDrawable.setExitFadeDuration(2500)
        AnimationDrawable.start()


        // Initialize the views
        QuizQuestion = findViewById(R.id.QuizQuestion)
        BtnFalse = findViewById(R.id.BtnFalse)
        BtnTrue = findViewById(R.id.BtnTrue)
        BtnNext = findViewById(R.id.BtnNext)
        Feedback = findViewById(R.id.Feedback)

        displayQuestion()

        //true and false buttons
        BtnTrue.setOnClickListener { checkAnswer(true) }
        BtnFalse.setOnClickListener { checkAnswer(false) }

        //next button to proceed to the next question
        BtnNext.setOnClickListener {
            currentQuestionIndex++
            if (currentQuestionIndex < questions.size) {
                displayQuestion()

                Feedback.text = ""
                BtnTrue.isEnabled = true
                BtnFalse.isEnabled = true

            } else {
                val intent = Intent(this, Score::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finishAffinity()
                exitProcess(0)
            }
            BtnNext.isEnabled = false
        }
        BtnNext.isEnabled = false
    }

    //display question
    private fun displayQuestion() {
        QuizQuestion.text = questions[currentQuestionIndex]

    }

    //check answer
    private fun checkAnswer(userAnswer: Boolean) {
        val correctAnswer = answers[currentQuestionIndex]

        if (userAnswer == correctAnswer) {
            Feedback.text = "Correct!"
            Feedback.setTextColor(Color.GREEN)
            score++
        } else {
            Feedback.text = "Incorrect!"
            Feedback.setTextColor(Color.RED)
        }

        BtnTrue.isEnabled = false
        BtnFalse.isEnabled = false
        BtnNext.isEnabled = true
    }
}
