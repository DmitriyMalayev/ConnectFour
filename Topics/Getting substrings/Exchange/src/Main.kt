fun main() {
    val string = readln()
    val f = string[0]
    val l = string[string.lastIndex]
    print("$l${string.substring(1, string.lastIndex)}$f")
}


