package com.example.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.adapters.databinding.CountryItemBinding

class CountryItemAdapter(private val context:Context,
private val countryItemList:MutableList<Country>):
RecyclerView.Adapter<CountryItemAdapter.CountryItemViewHolder>()
{

    class CountryItemViewHolder(countryItemBinding:CountryItemBinding):
    RecyclerView.ViewHolder(countryItemBinding.root)
    {
        private val binding=countryItemBinding
        fun bind(country: Country){
            binding.flagImage.setImageResource(country.flag)
            binding.name.text=country.name
            binding.capital.text=country.capital
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryItemViewHolder {
        val binding=CountryItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return CountryItemViewHolder(binding)
    }
    override fun onBindViewHolder(holder: CountryItemViewHolder, position: Int) {
        val countryItem=countryItemList[position]
        holder.bind(countryItem)
    }

    override fun getItemCount(): Int {
         return countryItemList.size
    }
}