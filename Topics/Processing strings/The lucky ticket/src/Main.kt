fun main() {
    val list = readLine()!!.map { it.digitToInt() }
    if ((list.subList(0,3).sum()) == (list.subList(3,6).sum())) {
        println("Lucky")
    } else {
        println("Regular")
    }
}