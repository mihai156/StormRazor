package com.example.stormrazor

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StormRazorViewModel: ViewModel() {

    private val model = StormRazorModel()

    val uiTextLiveData = MutableLiveData<MutableList<City>>()

    fun getCities() {
        val updatedText = model.getCities()
        uiTextLiveData.postValue(updatedText)
    }
}