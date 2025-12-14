package com.example.minimiallauncher.model

object RetrofitInstance {
    private val retrofit by lazy {
        retrofit2.Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/")
            .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
            .build()
    }

    val api: WeatherApi by lazy { retrofit.create(WeatherApi::class.java) }
}
