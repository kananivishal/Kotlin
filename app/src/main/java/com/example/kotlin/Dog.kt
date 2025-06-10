package com.example.kotlin

class Dog(private val name:String, private var age: Int = 1) {
    init {
        bark(name)
        println("Init Block Over!")
    }

    fun food() {
        println("Food Function Call")
    }

    private fun bark(name:String) {
        println("The dog name is a $name and this is a $age years old!")
    }
}