fun main() {
    val report = readLine()!!
    val isRegex = Regex("[0-9] wrong answers?")

    println("${isRegex.matches(report)}")
}