package com.example.roadmap_programminglanguage_kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.roadmap_programminglanguage_kotlin.models.MyModel

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.qualifiedName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arr = ArrayList<String>();
        arr.add("file")
        arr.add("edit")
        arr.add("view")
        arr.add("navigate")
        Log.d("onCreate: ", arr.joinToString(", ", "[", "]"))

        var m = MyModel()
        m.sName = "alo"
        Log.d(TAG, "onCreate: " + m.sName)
    }
}
