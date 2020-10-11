package com.coolweather.android

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var prefs : SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        if (prefs.getString("weather", null) != null){
            var intent : Intent = Intent(this, WeatherActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    class SharedPreference(val context: Context) {
        private val PREFS_NAME = "weather"
        val sharedPref: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    }
}
