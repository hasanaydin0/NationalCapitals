package com.hasanaydin.nationalcapitals

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanaydin.nationalcapitals.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val name = intent.getStringExtra("name")
        binding.textView.text = name

        val imageId = intent.getIntExtra("image",0)
        val selectedBitmap = BitmapFactory.decodeResource(applicationContext.resources,imageId)
        binding.imageView.setImageBitmap(selectedBitmap)

    }
}