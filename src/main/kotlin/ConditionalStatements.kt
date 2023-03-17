fun main(args: Array<String>) {
    // IF STATEMENTS
    var  age = 20
    if (age < 18 ){
        println("You are underage")
    }else{
        println("Welcome to the party")
    }

    var weight = 100
    var height = 1.9
    var bmi = weight/(weight * weight)
    if ( bmi <= 18){
        println("Underweight")
    }else if (bmi <= 24){
        println("Normal weight")
    }else if (bmi <= 29){
        println("Overweight")
    }else {
        println("Obese")}


    var marks = 80
    if (marks >= 90){
        println("A")
    }else if (marks >= 80) {
        println("B")
    }else if (marks >= 60) {
        println("C")
    }else if (marks >= 40) {
        println("D")
    }else if (marks >= 20) {
        println("Y")
    }else{
        println("Fail")
    }


    // WHEN STATEMENTS
    var battingNumber = 0
    when (battingNumber) {
        1 -> {
            println("You lost")
        }
        2 -> {
            println("You lost")
        }
        3 -> {
            println("You Won")
        }
        4 -> {
            println("You lost")
        }
        else->{
            println("Please enter a number from 1 - 4 to bet")
        }
    }
}