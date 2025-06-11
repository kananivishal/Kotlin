package com.example.kotlin

fun main() {
    recall()
}

fun recall() {
    print("Enter Number 1:")
    val num1 = readln()
    print("Enter Number 2:")
    val num2 = readln()
    println("Select operation:")
    println("+) Addition")
    println("-) Subtraction")
    println("*) Multiplication")
    println("/) Division")
    println("exit) Exit")
    val operation = readln()

    var result = 0.0

    if (operation == "+") {
        result = add(num1.toDouble(), num2.toDouble())
    } else if (operation == "-") {
        result = sub(num1.toDouble(), num2.toDouble())
    } else if (operation == "*") {
        result = mul(num1.toDouble(), num2.toDouble())
    } else if (operation == "/") {
        result = div(num1.toDouble(), num2.toDouble())
    } else if (operation == "exit" || operation == "Exit") {
        return
    } else {
        println("Please choice valid operation")
        recall()
    }

    println("$num1 $operation $num2 = $result")
    recall()
}

fun add(num1: Double = 0.0, num2: Double = 0.0): Double {
    val result = num1 + num2
    return result
}

fun sub(num1: Double = 0.0, num2: Double = 0.0): Double {
    val result = num1 - num2
    return result
}

fun mul(num1: Double = 0.0, num2: Double = 0.0): Double {
    val result = num1 * num2
    return result
}

fun div(num1: Double = 0.0, num2: Double = 0.0): Double {
    if (num2 == 0.0) {
        println("Can't Divide by 0!")
        recall()
    }
    val result = num1 / num2
    return result
}