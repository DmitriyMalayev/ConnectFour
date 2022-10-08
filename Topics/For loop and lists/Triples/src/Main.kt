fun main() {
    val intList = MutableList(readln().toInt()) { readln().toInt() }
    var count = 0
    for (i in 0 until intList.size - 2) {
        if (intList[i] + 1 == intList[i + 1] && intList[i] + 2 == intList[i + 2]) count++
    }
    println(count)
}