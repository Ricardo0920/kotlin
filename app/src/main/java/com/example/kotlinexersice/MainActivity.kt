package com.example.kotlinexersice

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//👇 kotlin 默认不继承如同Java 用final关键字修饰的类
open class MainActivity : AppCompatActivity(), View.OnClickListener {

    // 非空filed在kotlin中需要初始化，并且初始化不能为null
    private lateinit var mTv: TextView
    //      👆 表示延时初始化
    private lateinit var mTextView: TextView
    private lateinit var mTvDo: TextView
    private val mUser = User.A.user
    private val mSequence: Sequence<Int> = sequenceOf(21, 40, 11, 33, 78)
    private var result: Sequence<Int>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTv = findViewById(R.id.tv)
        mTextView = findViewById(R.id.textView)
        mTvDo = findViewById(R.id.tv_do)
        showViewId(mTv)
        mTextView.text = mUser.name
        mTextView.setOnClickListener(this)
        mTv.setOnClickListener(this)
        mTvDo.setOnClickListener(this)

        result = mSequence.map { it }.filter { it % 3 == 0 }
    }

    private fun showViewId(view: View?) {
        if (view is TextView) {
            view.text = getString(R.string.show_id, view.id)
        }
        (view as? TextView)?.text = getString(R.string.show_id, view?.id)
    }

    /**
     * @link View.OnClickListener
     */
    //👇 kotlin override具有遗传 前面加上final的话关闭override的遗传性
    final override fun onClick(v: View?) {
        when(v) {
            mTextView -> {
                mUser.name = "songp"
                mUser.id = 2
                mTextView.text = mUser.name
            }
            mTv -> {
                mTv.text = Student(1, "lmm").show()
            }
            mTvDo -> {
                val sb = StringBuilder()
                result?.forEach { sb.append(it).append(",") }
                mTvDo.text = sb.toString()
            }
        }
    }

}