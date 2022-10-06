class Pirate(name: String) {
    var name: String = name
        private set
}

fun main() {
    val captain = Pirate("Hector Barbossa")
    val captain2 = Pirate("Jack Sparrow")
    val newCaptain = captain2

    println(captain.name)
    println(captain2.name)

}
