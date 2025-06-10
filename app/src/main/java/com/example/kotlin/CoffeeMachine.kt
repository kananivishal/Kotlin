package com.example.kotlin

fun main() {
    coffeeDetails()
}

fun coffeeDetails() {
    print("Who is this coffee for? ")
    val name = readln()
    print("How many pieces of sugar  do you want? ")
    val sugarCount = readln().toInt()
    makeCoffee(sugarCount, name)
}

fun makeCoffee(sugarCount: Int, name: String) {
    if (sugarCount == 0)
    {
        println("Coffee with no spoon of sugar for $name")
    }
    else{
        println("Coffee with $sugarCount spoon of sugar for $name")
    }
//    return coffeeDetails()
}