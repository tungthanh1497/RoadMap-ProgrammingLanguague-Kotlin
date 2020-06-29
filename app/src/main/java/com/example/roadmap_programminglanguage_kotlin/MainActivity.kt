package com.example.roadmap_programminglanguage_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arr = ArrayList<String>();
        arr.add("file")
        arr.add("edit")
        arr.add("view")
        arr.add("navigate")
        Log.d("onCreate: ", arr.joinToString(", ", "[", "]"))
    }
}
