package com.example.kotlinexersice

const val CONST_SECOND_NUMBER = 2
                            // 👇主构造器中直接声明属性 ==等价于在类中创建了该名称的属性
class User private constructor(var id: Int) {

    var name = "Mike"
        get() {
            return "$field nb"
        }
        set(value) {
            field = "Cute $value"
        }

    init {
        // 初始化代码块，先于下面的构造器执行
        name = "Mike"
    }

    val strs: Array<String> = arrayOf("a", "b", "c")
    val strList = listOf("a")

    private constructor(id: Int, name: String) : this(id) {
        this.name = name
    }

    object A {
        const val CONST_FIRST_NUMBER = 1
        val user = User(1, "lmm")
    }

    //    👇        companion object 伴生对象等同static
    companion object {
        const val CONST_NUMBER = 0
        // 👆 限制类型必须是基本类型
    }
}