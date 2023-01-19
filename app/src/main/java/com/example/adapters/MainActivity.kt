package com.example.adapters

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val countryItemList:MutableList<Country> = mutableListOf()
    private lateinit var adapter:CountryItemAdapter
    private lateinit var bind:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind=ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.rv)
        countryList()
        setUpAdapter()
    }
    private fun countryList() {
        countryItemList.add(Country("Колумбия","Богото",R.drawable.columbia))
        countryItemList.add(Country("Великобритания","Лондон",R.drawable.gbr))
        countryItemList.add(Country("Марокко","Марокко",R.drawable.marokko))
        countryItemList.add(Country("Россия","Москва",R.drawable.russia))
        countryItemList.add(Country("Испания","Мадрид",R.drawable.spain))
    }
    private fun setUpAdapter()
    {
        adapter=CountryItemAdapter(this,countryItemList)
        bind.rv.adapter=adapter
        bind.rv.layoutManager=LinearLayoutManager(this)
    }
}