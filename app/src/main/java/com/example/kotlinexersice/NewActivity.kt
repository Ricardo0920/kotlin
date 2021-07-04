package com.example.kotlinexersice

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log

private const val TAG = "NewActivity"

private class NewActivity : MainActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
        User.CONST_NUMBER
        User.A.CONST_FIRST_NUMBER
    }

                                //👇 这里的object : 修饰的都是接口或抽象类
    val listener: TextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            TODO("Not yet implemented")
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            TODO("Not yet implemented")
        }

        override fun afterTextChanged(s: Editable?) {
            TODO("Not yet implemented")
        }
    }
}