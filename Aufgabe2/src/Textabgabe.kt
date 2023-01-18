/*
Schreibe hier deine Antwort hin.
// es Werden 4 Bücher angezeigt aber der Index beginnt bei Null und nicht mit 1

 */

fun main() {                          // 0            // 1             // 2    // 3 - Index
    val books: List<String> = listOf("Harry Potter", "Herr der Ringe", "Dune", "Eragon")
    for(i in 0..books.size-1) {
        val book = books[i]
        println("Das Buch an der Stelle $i ist $book.")
    }
    println("Das waren alle Buecher")
}