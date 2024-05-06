package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton = findViewById<Button>(R.id.StartButton)
        startButton.setOnClickListener {
            val intent= Intent( this,Page2Activity::class.java)
            intent.putExtra("FEED_MESSAGE", "I am hungry")
            startActivity(intent)
        }
    }
}