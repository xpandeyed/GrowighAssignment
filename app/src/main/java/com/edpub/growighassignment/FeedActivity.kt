package com.edpub.growighassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FeedActivity : AppCompatActivity() {
    private val urls = ArrayList<String>()
    var refresh = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        Toast.makeText(this, "Tap on latest to refresh recycler view", Toast.LENGTH_LONG).show()

        getURls(refresh)
        refresh+=10
        val adapter = RecyclerViewAdapter(urls)
        val recyclerView = findViewById<RecyclerView>(R.id.rvFeed)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val latestButton = findViewById<TextView>(R.id.tvLatest)
        latestButton.setOnClickListener{
            getURls(refresh)
            refresh+=10
            adapter.notifyDataSetChanged()
        }

    }

    fun getURls(refreshNum : Int) {
        urls.clear()
        for(i in 1..10){
            urls.add("https://picsum.photos/200/300?random=${i+refreshNum}")
        }
    }

}