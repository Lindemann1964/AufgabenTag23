



fun main() {
    val guests = listOf<String>("Paul", "Keanu", "Michael", "Hans", "Lukas", "Marko")
    for (i in 0..guests.size - 1) {
        if (guests[i] == "Lukas") {
            println("Hey Lukas kommt!")
        }
        if (guests[i] == "Keanu") {
            println("Oh cool, Keanu is auch dabei!")
        }
        if (guests[i] == "Michael") {
            println("Wie es Michael wohl geht?")
        }
    }
}
                 //   Schreibe hier deine Antwort hin: Es sind 6 Namen in der Liste
                 //   Es werden nur 3 Namen
