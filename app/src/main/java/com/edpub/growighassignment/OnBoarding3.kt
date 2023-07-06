package com.edpub.growighassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding3)

        val bSkipIntro = findViewById<Button>(R.id.bSkipIntro)

        bSkipIntro.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = (Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        val bReady = findViewById<Button>(R.id.bReady)
        bReady.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = (Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }
}