package com.sizhangding.app.HomePage.Weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sizhangding.app.R

class WeatherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("WeatherActivity", "get Here")
        setContentView(R.layout.weather_view)
    }

}
