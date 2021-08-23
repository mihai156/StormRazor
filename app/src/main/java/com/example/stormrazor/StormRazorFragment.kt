package com.example.stormrazor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_storm_razor.*


class StormRazorFragment : Fragment() {

    private val viewModel: StormRazorViewModel by activityViewModels()
    private lateinit var listOfCities : MutableList<City>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_storm_razor, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
        }
        fragmentTextUpdateObserver()
        viewModel.getCities()
    }

    private fun fragmentTextUpdateObserver() {
        viewModel.uiTextLiveData.observe(viewLifecycleOwner, { updatedText ->
            listOfCities = updatedText
            recyclerView.adapter = CityAdapter(listOfCities)
        })
    }

}
