package com.example.kotlinexersice

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//👇 kotlin 默认不继承如同Java 用final关键字修饰的类
open class MainActivity : AppCompatActivity() {

    // 非空filed在kotlin中需要初始化，并且初始化不能为null
    private lateinit var mtv : TextView
    //      👆 表示延时初始化

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mtv = findViewById(R.id.tv)
        showViewId(mtv)
    }

    private fun showViewId(view: View?) {
        if (view is TextView) {
            view.text = getString(R.string.show_id, view.id)
        }
        (view as? TextView)?.text = getString(R.string.show_id, view?.id)
    }
}