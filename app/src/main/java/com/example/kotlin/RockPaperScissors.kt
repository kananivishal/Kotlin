package com.example.kotlin

fun main() {
    var computerChoice = ""
    println("Choice Rock, Paper or Scissors? between 1 to 3")
    println("1 = Rock")
    println("2 = Paper")
    println("3 = Scissors")
    println("Enter your Rock, Paper or Scissors number between 1 to 3!")
    var userChoice = readln()
    if (userChoice == "1"){
        userChoice = "Rock"
    }
    else if (userChoice == "2"){
        userChoice = "Paper"
    }
    else if (userChoice == "3"){
        userChoice = "Scissors"
    }
    else{
        println("Invalid choice!")
    }

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
        else -> println("Something want's wrong!")
    }

//    if (randomNumber == 1) {
//        computerChoice = "Rock"
//    } else if (randomNumber == 2) {
//        computerChoice = "Paper"
//    } else if (randomNumber == 3) {
//        computerChoice = "Scissors"
//    } else {
//        println("Something want's wrong!")
//    }

    println("Your choice = $userChoice")
    println("Computer choice = $computerChoice")

    val winner = when {
        userChoice == computerChoice -> "It's a tie"
        userChoice == "Rock" && computerChoice == "Scissors" -> "You are won!"
        userChoice == "Paper" && computerChoice == "Rock" -> "You are won!"
        userChoice == "Scissors" && computerChoice == "Paper" -> "You are won!"
        else -> "Compute is won!"
    }
    println(winner)

}