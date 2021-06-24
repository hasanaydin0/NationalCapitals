package com.hasanaydin.nationalcapitals

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.hasanaydin.nationalcapitals.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Data
        var countries = ArrayList<String>()
        countries.add("Turkey")
        countries.add("England")
        countries.add("Germany")
        countries.add("Italy")
        countries.add("France")

        var cities = ArrayList<String>()
        cities.add("Ankara")
        cities.add("London")
        cities.add("Berlin")
        cities.add("Roma")
        cities.add("Paris")

        val ankaraId = R.drawable.ankara
        val londonId = R.drawable.london
        val berlinId = R.drawable.berlin
        val romaId = R.drawable.roma
        val parisId = R.drawable.paris

        val imageId = ArrayList<Int>()
        imageId.add(ankaraId)
        imageId.add(londonId)
        imageId.add(berlinId)
        imageId.add(romaId)
        imageId.add(parisId)

        // Adapter
        val adapter = ArrayAdapter(this,R.layout.list_row,R.id.textRow,countries)
        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(this,DetailsActivity::class.java)
            intent.putExtra("name",cities[position])
            intent.putExtra("image",imageId[position])

            startActivity(intent)
        }

    }
}