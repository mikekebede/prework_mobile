package com.example.hellohelu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //show the layout file :activity_main
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener{
            Log.i("Helu","Tapped on button")

            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(com.google.android.material.R.color.m3_timepicker_button_ripple_color))

    }
}}