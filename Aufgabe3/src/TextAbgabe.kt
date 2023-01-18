/*
Schreibe hier deine Antwort hin. an denn Tagen von Mo bis Freitag  muss ich Arbeiten
                                // von Sa bis Sonntag habe ich frei
                                // kapiere ich trotzdem nicht !!
 */fun main() {
    val weekDays: List<String> = listOf(        // Liste erstellen
        "Montag", "Dienstag", "Mittwoch",
        "Donnerstag", "Freitag", "Samstag", "Sonntag"
    )
    for (day in weekDays) {                     // for schleife auslesen ( Wochenende) habe ich frei
        if (day == "Samstag" || day == "Sonntag") {
            println("am $day hab ich frei.");
        } else {                               // abfrage ob Frei oder Arbeiten
            println("am $day muss ich arbeiten."); // Konsolen ausdruck
        }
    }
}