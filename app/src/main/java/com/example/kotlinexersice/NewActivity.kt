package com.example.kotlinexersice

import android.os.Bundle
import android.util.Log

private const val TAG = "NewActivity"

private class NewActivity : MainActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
    }
}