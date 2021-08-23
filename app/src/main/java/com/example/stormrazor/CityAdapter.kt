package com.example.stormrazor

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.wether_item.view.*

class CityAdapter(private val cities: List<City>) : RecyclerView.Adapter<CityAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.wether_item, parent, false)

        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val city = cities[position]
        holder.cityName.text = city.name
        holder.cityLatLong.text = city.latitude + "°N " + city.longitude + "°E"
        holder.cityTemperature.text = city.degrees.toString() + "°"
        holder.cityStatus.text = city.status

    }

    override fun getItemCount(): Int {
        return cities.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cityName = itemView.cityName!!
        val cityLatLong = itemView.cityLatLong!!
        val cityTemperature = itemView.cityTemperature!!
        val cityStatus = itemView.cityStatus!!

    }
}