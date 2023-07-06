package com.edpub.growighassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)

        val bSkipIntro = findViewById<Button>(R.id.bSkipIntro)

        bSkipIntro.setOnClickListener{
            val intent = Intent(this, FeedActivity::class.java)
            startActivity(intent)
        }
    }
}