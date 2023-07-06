package com.edpub.growighassignment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sharedpreferences = getSharedPreferences("is_first", MODE_PRIVATE)


        //get value from shared preference
        val is_first = sharedpreferences.getBoolean("is_first", true)

        Log.i("is_first", is_first.toString())

        //if is_first is true then set it false and save it to shared preferences
        if (is_first) {
            val editor = sharedpreferences.edit()
            editor.putBoolean("is_first", false)
            editor.apply()

            val intent = Intent(this, OnBoarding1::class.java)
            intent.flags = (Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }else{
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = (Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }


    }
}