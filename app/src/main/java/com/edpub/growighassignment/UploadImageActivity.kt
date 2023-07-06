package com.edpub.growighassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class UploadImageActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_image)

        imageView = findViewById<ImageView>(R.id.ivImage)

        val selectImage = findViewById<Button>(R.id.bSelectImage)
        selectImage.setOnClickListener {
            imageChooser()
        }

    }

    private fun imageChooser() {

        val i = Intent()
        i.type = "image/*"
        i.action = Intent.ACTION_GET_CONTENT

        startActivityForResult(Intent.createChooser(i, "Select Picture"), 200)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        imageView.setImageURI(data?.data)
    }
}