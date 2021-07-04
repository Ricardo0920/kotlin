package com.example.kotlinexersice

class Student(var id: Int, var name: String) {

    var age: Int = 0
    var description: String? = null

    init {

    }

    constructor(id: Int, name: String, age: Int) : this(id, name) {
        this.age = age
    }

    constructor(id: Int, name: String, description: String) : this(id, name) {
        this.description = description
    }

    override fun toString(): String {
        return "Student, id: $id; name: $name"
    }

    fun show(): String = toString()
}