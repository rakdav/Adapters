package com.example.adapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CountryActivity : AppCompatActivity() {
    private lateinit var countryName:TextView
    private lateinit var countryCapital:TextView
    private lateinit var countryDesc:TextView
    private lateinit var countryFlag:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country)
        countryName=findViewById(R.id.nameContry)
        countryCapital=findViewById(R.id.capitalCountry)
        countryDesc=findViewById(R.id.description)
        countryFlag=findViewById(R.id.countryFlag)
    }
}