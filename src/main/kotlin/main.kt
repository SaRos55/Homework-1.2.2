fun main() {
    val likes = 71
    val peopleString = if (likes % 10 == 1) "человеку" else "человекам"
    println("Понравилось $likes $peopleString")
}