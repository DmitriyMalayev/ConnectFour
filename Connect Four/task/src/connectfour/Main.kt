package connectfour


fun main() {
    println("Connect four")
    val game = FourConnect()
    game.initGameD()
    game.printData()
}
class FourConnect {
    private var firstPlayer: String = ""
    private var secondPlayer: String = ""
    private var row = 6
    private var col = 7

    fun initGameD() {
        println("First player's name:")
        firstPlayer = readln()
        println("Second player's name:")
        secondPlayer = readln()
        while (true) {
            println("Set the board dimensions (Rows x Columns)")
            println("Press Enter for default (6 x 7)")
            var temp  = ""
            try {
                temp = readln()
                val (row, col) = temp.split("x", "X").map { it.trim().toInt() }
                this.row = row
                this.col = col
            } catch (e: Exception) {
                if(temp == "") break
                else {
                    println("Invalid input")
                    continue
                }
            }
            if (row < 5 || row > 9) println("Board rows should be from 5 to 9")
            else if (col < 5 || col > 9) println("Board columns should be from 5 to 9")
            else break
        }
    }
    fun printData() {
        println("$firstPlayer VS $secondPlayer")
        println("$row X $col board")
    }
}

