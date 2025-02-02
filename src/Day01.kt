import kotlin.math.abs

fun main() {
    val readTest = readInput("day1")
//    partOne(readTest)
//    partTwo(readTest)
}

fun partOne(list: List<String>) {
    list
        .map { line ->
            line.split("   ").let {
                it[0].toInt() to it[1].toInt()
            }
        }
        .unzip()
        .let {
            it.first.sorted().zip(it.second.sorted())
        }
        .sumOf { abs(it.first - it.second) }
        .println()
}

fun partTwo(list: List<String>) {
    list
        .map { line ->
            line.split("   ").let {
                it[0].toInt() to it[1].toInt()
            }
        }
        .unzip()
        .let { pair ->
            return@let pair.first.sumOf { item -> item * pair.second.count { it == item } }
        }
        .println()
}