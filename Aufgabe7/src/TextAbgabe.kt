fun main() {
  val speedLimits: List<Int> = listOf(30, 50, 80, 100, 120)  // speedListe erstellen
  for (i in 0..speedLimits.size - 1) {
    if (speedLimits[i] == 30) {
      println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.") // geschwindigkeit auf der Strasse
    } else if (speedLimits[i] == 80) {
      println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.") // geschwindigkeit auf der Strasse
    } else if (speedLimits[i] == 120) {
      println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.") // geschwindigkeit auf der Strasse
    }
  }
}
                            // Schreibe hier deine Antwort hin:

                            // 0. Strasse kann man 30km/h fahren.
                            // 2. Strasse kann man 80km/h fahren.
                            // 4. Strasse kann man 120km/h fahren.