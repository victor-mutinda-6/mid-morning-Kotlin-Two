fun main(args: Array<String>) {
    var marks = 90
    var grade = if(marks < 50){
        "E"
    }else if (marks < 60){
        "D"
    } else if (marks < 60){
        "C"
    } else if (marks < 60){
        "B"
    } else{
        "A"
    }
    println(grade)


    var bettingnumber = 0
    var bettingresult = when(bettingnumber){
     1 -> {
         "YOU LOST"
    }
    2 -> {
        "YOU WON"
    }
    3 -> {
        "YOU LOST"
    }
        else ->{
            "Enter the number between 1-3 to bet"
        }
    }


println(bettingresult)
}