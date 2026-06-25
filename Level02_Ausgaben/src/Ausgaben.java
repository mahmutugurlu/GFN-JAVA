public class Ausgaben {
    public static void main(String[] args) {

        // Beispielvariablen
        int zahl = 12;
        String name = "Kevin";
        char buchstabe = 'K';
        double temperatur = 21.165165;

        // =========================
        // 1) println()
        // =========================
        // Gibt aus und springt danach in die nächste Zeile

        System.out.println("Hello World");          // -> "Hello World" + newline (neue Zeile)
        System.out.println("Zahl: " + zahl);

        // Wichtig: Reihenfolge bei der String-Konkatentation(Verkettung)
        // Sobald ein String beteiligt ist, dient + zum Verketten von Texten
        System.out.println(zahl + zahl + " ist das Ergebnis");
        System.out.println("Ergebnis: " + zahl + zahl);
        System.out.println("Ergebnis: " + (zahl + zahl));

        // =========================
        // 2) print()
        // =========================
        // Gibt aus, SPRINGT ABER NICHT IN EINE NEUE ZEILE

        System.out.print("Ohne Zeilenumbruch: ");
        System.out.print(zahl);
        System.out.print(" <- hier endet die Zeile\n");         // \n manuell für neue Zeile (Escape-Zeichen)

        System.out.println("_______________________");

        System.out.print("Hier steht Text vor dem Tabulator\t");        // \t für Tabulator (Einrückung)
        System.out.print("Dieser Text erscheint hinter dem Tabulator\n");
        System.out.println("In der nächsten Zeile geht es weiter");

        // =========================
        // 3) printf() — formatierte Ausgabe
        // =========================

        // printf verwendet Format-Placeholders wie:
        // %s -> String
        // %d -> ganze Zahl (int, long etc.)
        // %f -> Fließkommazahl (float, double)
        // %c -> einzelnes Zeichen (char)
        //
        // Wichtig: printf springt NICHT automatisch in die neue Zeile.
        // Verwende %n (plattformunabhängig) oder \n (Unix/Linux/Mac) für Zeilenumbruch.

        // %s wird durch einen String 'name' ersetzt
        System.out.printf("Hallo %s%n", name);

        // %d (für Decimal) ersetzt eine ganze Zahl
        System.out.printf("Du bist %d Jahre alt.%n", zahl);

        // %c ersetzt ein einzelnes Zeichen
        System.out.printf("Hallo %s. Dein Name beginnt mit %c%n", name, buchstabe);

        // %f ersetzt eine Fließkommazahl
        System.out.printf("Temperatur (voll): %f%n", temperatur);

        // %.3f rundet die Fließkommazahl auf 3 Nachkommastellen
        System.out.printf("Temperatur (gerundet): %.3f%n", temperatur);

        double number = Math.round(temperatur);

        // Die Klasse Math hat hilfreiche mathematische Funktionen
        System.out.println(number);

        // -------------------------
        // 3.1) Feldbreite und Ausrichtung
        // -------------------------

        // %10s -> rechtsbündig in einem Feld mit mindestens 10 Zeichen
        System.out.printf("|%10s|%n", name);

        // %-10s -> linksbündig in einem Feld mit mindestens 10 Zeichen
        System.out.printf("|%-10s|%n", name);

        // %8.2f -> Feldbreite mit 8 Zeichen, 2 Nachkommastellen
        System.out.printf("|%8.2f|%n", temperatur);

        // ====================
        // 3.2) String.format
        // ====================
        // String.format funktioniert wie printf, liefert aber eine formatierte Zeichenkette,
        // die man z.B. weiterverarbeiten oder speichern kann
        String meldung = String.format("%s: %.1f°C", "Klima", temperatur);
        System.out.println(meldung);


    }
}