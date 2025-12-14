package com.example.minimiallauncher.model

import android.graphics.drawable.Drawable
import androidx.room.Entity
import androidx.room.PrimaryKey

data class AppModel(
    val appName : String,
    val packageName: String,
    val icon : Drawable
)
@Entity(tableName = "notes")
data class Notes(
    @PrimaryKey val id: Int = 0, // just one sticky note
    val content: String
)
data class WeatherResponse(
    val main: Main,
    val weather: List<Weather>,
    val name: String
)

data class Main(val temp: Double, val humidity: Int)
data class Weather(val description: String)


