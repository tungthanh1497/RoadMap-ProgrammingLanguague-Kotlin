package com.example.roadmap_programminglanguage_kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.qualifiedName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Numbers
        val a: Int = 10000
        val d: Double = 100.00
        val f: Float = 100.00f
        val l: Long = 1000000004
        val s: Short = 10
        val b: Byte = 1
        Log.d(TAG, "Your Int Value is : $a")
        Log.d(TAG, "Your Double Value is : $d")
        Log.d(TAG, "Your Float Value is : $f")
        Log.d(TAG, "Your Long Value is : $l")
        Log.d(TAG, "Your Short Value is : $s")
        Log.d(TAG, "Your Short Value is : $b")

        // Characters
        val letter: Char = 'A'    // defining a variable         // Assigning a value to it
        Log.d(TAG, "$letter")


        // Boolean
        val con: Boolean = true
        Log.d(TAG, "$con")

        // Strings
        val name: String = "TungTT"
        Log.d(TAG, "Hello $name")

        // Arrays
        val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
        Log.d(TAG, "Hey!! I am array Example: " + numbers.contentToString())

        // Collections
        val numberList: MutableList<Int> = mutableListOf(1, 2, 3) //mutable List
        val readOnlyView: List<Int> = numberList                  // immutable list
        println("my mutable list--$numberList")        // prints "[1, 2, 3]"
        numberList.add(4)
        println("my mutable list after addition --$numberList")        // prints "[1, 2, 3, 4]"
        println(readOnlyView)
//        readOnlyView.clear()    // ⇒ does not compie
    }
}
