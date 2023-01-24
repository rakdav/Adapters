package com.example.adapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CountryActivity : AppCompatActivity() {
    companion object
    {
        const val NAME_COUNTRY="name_country"
        const val FLAG_COUNTRY="flag_country"
        const val CAPITAL_COUNTRY="capital_country"
        const val DESC_COUNTRY="desc_country"
    }
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
        countryName.text=intent.getStringExtra(NAME_COUNTRY)
        countryCapital.text=intent.getStringExtra(CAPITAL_COUNTRY)
        countryDesc.text=intent.getStringExtra(DESC_COUNTRY)
        countryFlag.setImageResource(intent.getIntExtra(FLAG_COUNTRY,0))
    }
}