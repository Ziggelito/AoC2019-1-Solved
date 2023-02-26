import java.io.File
// Lösningen av användare AFRUITPIE på reddit hittad i tråden https://www.reddit.com/r/adventofcode/comments/e4axxe/2019_day_1_solutions/
//

fun partOne() { println(File("src/main/kotlin/input").readLines().map{(it.toInt() /3 - 2)}.sum())}

fun partTwo() {
    val fuel = File("src/main/kotlin/input").readLines().map {
        val componentFuel = (it.toInt()/3 - 2)
        componentFuel+calcMetaFUel(componentFuel)
    }.sum()
    println(fuel)
}
fun calcMetaFUel(fuel: Int) : Int {
    val metaFuel = fuel/3-2
    return if (metaFuel <=0) 0 else metaFuel+ calcMetaFUel(metaFuel)
}
fun main(){
    partOne()
    partTwo()
}

