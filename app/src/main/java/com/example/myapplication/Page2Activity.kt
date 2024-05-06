package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Page2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        val petImageView = findViewById<ImageView>(R.id.img_1.png)

        val feedButton = findViewById<Button>(R.id.feedButton)

        val cleanButton = findViewById<Button>(R.id.cleanButton)

        val playButton = findViewById<Button>(R.id.playButton)

        val feedTextView = findViewById<TextView>(R.id.feedTextView)

        val cleanTextView = findViewById<TextView>(R.id.cleanTextView)

        val playTextView = findViewById<TextView>(R.id.playTextView)



        val feedMessage = intent.getStringExtra("FEED_MESSAGE")


        feedTextView.text = feedMessage



        feedButton.setOnClickListener {


            petImageView.setImageResource(R.drawable.eating)



            feedTextView.text = getString(R.string.feed_thank_you)


            playTextView.text = getString(R.string.play_with_me)

        }



        cleanButton.setOnClickListener {


            petImageView.setImageResource(R.drawable.cleaning)


            cleanTextView.text = getString(R.string.clean_nice_and_clean)
        }


        playButton.setOnClickListener {

            petImageView.setImageResource(R.drawable.img_1)

            playTextView.text = getString(R.string.play_that_was_fun)


            cleanTextView.text = getString(R.string.clean_nice_and_clean)

        }

    }

}
