package com.example.stormrazor

class StormRazorModel() {
    private val dummyData = mutableListOf(
        City("Cluj-Napoca", "46.72", "26.62", 30, "Clear"),
        City("London", "51.50", "00.12", 22, "Heavy Rain"),
        City("New York", "40.71", "74.00", 24, "Heavy Clouds"))

    public fun getCities(): MutableList<City> {
        return dummyData
    }
}