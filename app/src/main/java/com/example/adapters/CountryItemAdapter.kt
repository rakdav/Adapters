package com.example.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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
            binding.cv.setOnClickListener{
                val intent=Intent(binding.root.context,CountryActivity::class.java)
                intent.putExtra(CountryActivity.NAME_COUNTRY,country.name)
                intent.putExtra(CountryActivity.CAPITAL_COUNTRY,country.capital)
                intent.putExtra(CountryActivity.FLAG_COUNTRY,country.flag)
                intent.putExtra(CountryActivity.DESC_COUNTRY,country.Description)
                binding.root.context.startActivity(intent)
            }
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