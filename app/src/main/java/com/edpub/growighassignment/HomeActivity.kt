package com.edpub.growighassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bFeeds = findViewById<Button>(R.id.bFeeds)
        bFeeds.setOnClickListener {
            val intent = Intent(this, FeedActivity::class.java)
            startActivity(intent)
        }

        val bUploadImageActivity = findViewById<Button>(R.id.bUpload)
        bUploadImageActivity.setOnClickListener {
            val intent = Intent(this, UploadImageActivity::class.java)
            startActivity(intent)
        }


    }
}