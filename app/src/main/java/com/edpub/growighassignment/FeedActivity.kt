package com.edpub.growighassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        val adapter = RecyclerViewAdapter()
        val recyclerView = findViewById<RecyclerView>(R.id.rvFeed)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val latestButton = findViewById<TextView>(R.id.tvLatest)
        latestButton.setOnClickListener{
            Toast.makeText(this, "Latest", Toast.LENGTH_LONG).show()
            adapter.notifyDataSetChanged()
        }

    }

}