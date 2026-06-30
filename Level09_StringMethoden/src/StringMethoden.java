public class StringMethoden {

    public static void main(String[] args) {

        // =========================
        // 1) Strings erstellen
        // =========================

        // String-Literale werden im String Pool gespeichert.
        // Existiert derselbe Text bereits, wird das vorhandene Objekt verwendet.
        String name = "Max";
        String name2 = "Max";

        String name3 = new String("Max");

        // Speicheradressen werden bei Objekten mit == verglichen
        System.out.println("name == name2 " + (name == name2));
        // Um die Werte von Strings zu vergleichen müssen wir .equals() benutzen
        System.out.println("name == name2 " + name.equals(name2));

        System.out.println("name == name3 " + (name == name3));
        System.out.println("name == name3 " + name.equals(name3));

        // =========================
        // 3) Wichtige Methoden
        // =========================
        String text = "    Java ist toll!    ";

        // length() -> Anzahl der Zeichen im String, inklusive Leerzeichen
        System.out.println("Länge: " + text.length());

        // trim() -> entfernt Leerzeichen am Anfang und Ende
        System.out.println("Nach trim(): '" + text.trim() + "'");

        // toUpperCase() / toLowerCase() -> es gibt neuen String in Groß-/ oder Kleinbuchstaben zurück
        System.out.println("Großbuchstaben: " + text.toUpperCase());
        System.out.println("Großbuchstaben: " + text.toLowerCase());

        // contains(String) -> prüft, ob ein Teilstring enthalten ist
        System.out.println("Enthält 'Java'? " + text.contains("Java"));


        // Original bleibt unverändert
        System.out.println("Original bleibt unverändert: " + text);

        // startWith() / endsWith() -> prüft Anfang bzw. Ende eines Strings
        System.out.println("Beginnt mit '    J' " + text.startsWith("    J"));
        System.out.println("Endet mit '    J' " + text.endsWith("!    "));

        // substring(int start, int end) -> Teilstring ausschneiden
        System.out.println("Teilstring (4, 8) " + text.substring(4,8));

        // replace(String alt, String neu) -> ersetzt alle Vorkommen
        System.out.println("Ersetze 'toll' durch 'super': " + text.replace("toll", "super"));

        // =========================
        // 4) Methodenverkettung
        // =========================
        // Leerzeichen entfernen + Großbuchstaben + Wort ersetzen
        System.out.println("    hallo java    ".trim().toUpperCase().replace("JAVA", "WELT"));

        // =========================
        // 5) Strings vergleichen (Groß- und KLeinschreibung ignorieren)
        // =========================
        String a = "Test";
        String b = "test";

        // euqals() vergleicht nur ob Strings genau gleich sind, beachtet auch Groß- und Kleinschreibung
        System.out.println("equals(): " + a.equals(b));

        // equalsIgnoreCase() -> Ignoriert Groß-/Kleinschreibung
        System.out.println("equalsIgnoreCase(): " + a.equalsIgnoreCase(b));

        // =========================
        // 5) Strings sind unveränderlich (immutable)
        // =========================
        // Ein String-Objekt kann nach seiner Erstellung nie verändert werden.
        // Jede "Änderung" erzeugt stattdessen ein neues Objekt im Speicher.
        // Das ursprüngliche Objekt bleibt unangetastet.
        //
        // Warum? Java speichert String-Literale im sogenannten String Pool.
        // Damit mehrere Variablen sicher dasselbe Objekt teilen können,
        // darf dieses Objekt nie verändert werden.

        String s = "Hallo";
        String t = s;

        System.out.println(s == t);

        s = s + " Welt";
        System.out.println(s);
        System.out.println(t);

        // =========================
        // 6) Warum ist String-Verkettung in Schleifen teuer?
        // =========================
        // Jedes + erzeugt ein neues String-Objekt im Speicher.
        // Bei vielen Wiederholungen summiert sich das schnell.
        // Beispiel: Telefonnummer normalisieren = nur Ziffern behalten

        String eingabe = "+49 (0)151-123 456 789";
        String normalisiert = "";

        for (int i = 0; i < eingabe.length(); i++) {
            char c = eingabe.charAt(i);
            if (Character.isDigit(c)){
                normalisiert = normalisiert + c;
            }
        }

        System.out.println(normalisiert);
        // Bei 10.000 Wiederholungen: 10.000 Objekte erstellt und wieder entsorgt.
        // StringBuilder löst dieses Problem, weil er intern einen veränderbaren Puffer nutzt
        // und erst am Ende einen einzigen String erzeugt.

        // =========================
        // 7) StringBuilder
        // =========================
        // Strings sind immutable. Viele Verkettungen = ineffizient
        // StringBuilder ist mutable und effizient bei vielen Änderungen
        StringBuilder sb = new StringBuilder();
        sb.append("Java");      // Text anhängen
        sb.append(" ist ");
        sb.append("cool!");
        System.out.println("StringBuilder: " + sb.toString());

        /*
         * Wichtige Methoden:
         * - append(...) -> Text oder Zahl anhängen
         * - insert(pos, ...) -> Text an bestimmter Position einfügen
         * - delete(start, end) -> Bereich löschen
         * - replace(start, end, ...) -> Bereich ersetzen
         * - reverse() -> Text umdrehen
         * - toString() -> in String umwandeln
         *
         * Empfehlung: StringBuilder verwenden, wenn man Text oft verändert oder viele Verkettungen macht.
         */

    }
}


