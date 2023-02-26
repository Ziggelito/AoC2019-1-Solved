import java.io.File


fun problemOne( data: List<Int>) : MutableList<Int> {
    val numbers = mutableListOf<Int>()
    for (a in 0 .. data.size -1){
        val result = data[a]/3 -2
        numbers.add(result)

    }
    return numbers
}

fun problemTwo( data: List<Int>) :MutableList<Int> {
    val numbers2 = mutableListOf<Int>()
    for (a in 0 .. data.size -1){


        val intake = data[a]
    var fuel = intake/3 -2
    var totalFuel = fuel
        while ( fuel/3-2>=1){

            totalFuel += fuel/3-2
            fuel = fuel/3-2
            //println(fuel)
        }

        numbers2.add(totalFuel)
    }
    return numbers2
}





fun main(){

    val data: List<Int> = File("src/main/kotlin/input").readLines().map{it.toInt()}


    println(problemOne(data).sum())
    println(problemTwo(data).sum())




}