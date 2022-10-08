fun main() {
    val size = readln().toInt()
    val list: MutableList<Int> = mutableListOf()
    for (i in 0 until size) {
        list.add(readln().toInt())
    }
    val (m, n) = readln().split(" ").map { it.toInt() }
    if (list.contains(m) && list.contains(n)) {
        println("YES")
    } else println("NO")
}
