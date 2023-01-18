fun main() {
  val fruechteListe: MutableList<String> = mutableListOf("Zitrone", "Banane", "Ananas", "Trauben")
  var lieblingsFrucht: String = "Erdbeere"

  for (i in 3 downTo 0) {
    if (fruechteListe[i] == "Banane") {
      lieblingsFrucht = "Banane"
    }
  }
  println(lieblingsFrucht)
}
                // Schreibe hier deine Antwort hin: Lieblingsfrucht "Erdbeere ist nicht in der Liste
                                                 // Lieblingsfrucht ausgabe "Banane"

