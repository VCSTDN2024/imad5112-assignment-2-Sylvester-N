package com.example.iqquizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Set up for background animation
        val LinearLayout = findViewById<LinearLayout>(R.id.main)
        val AnimationDrawable = LinearLayout.background as AnimationDrawable
        AnimationDrawable.setEnterFadeDuration(10)
        AnimationDrawable.setExitFadeDuration(2500)
        AnimationDrawable.start()

        // exit and play buttons
        val BtnPlay = findViewById<Button>(R.id.BtnPlay)
        val BtnExit = findViewById<Button>(R.id.BtnExit)


        // Play button to take the user to the flashcard activity
        BtnPlay.setOnClickListener {
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
