package connectfour

fun main() {
    println("Connect Four")
    println("First player's name:")
    val firstPlayer = readln()
    println("Second player's name:")
    val secondPlayer = readln()
    println("Set the board dimensions (Rows x Columns)")
    println("Press Enter for default (6 x 7)")

    if (readln().isNotEmpty()) {
        val (row, col) = readln().split("x")
    } else {
        val row = 6
        val col = 7
    }
}