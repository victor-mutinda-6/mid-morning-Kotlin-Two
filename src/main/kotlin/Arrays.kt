fun main(args: Array<String>) {
    var names = arrayListOf("Yvonne","Erick","Dennis","Alphy","Thelma")
    println(names[2])
    names.add("King")
    //Use for in a loop to print
    for (i in 0 until (names.size - 1)){
        println(names[i])
    }
   //You can use a foreach loop as well
    names.forEach{
        println(it) }
}