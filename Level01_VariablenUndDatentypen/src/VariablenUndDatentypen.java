public class VariablenUndDatentypen {

    public static void main(String[] args) {

        // =========================================
        // 1) Kommentare
        // =========================================

        // Kommentare sind Erklärungen für den Menschen (Programmierer)
        // Der Computer ignoriert sie vollständig
        // -> Kommentare helfen Code verständlich zu machen

        // Einzeiliger Kommentar

        /* Mehrzeiliger
         (gehört auch zum mehrzeiligen Kommentar)
         Kommentar */

        // =========================================
        // 2) Variablen & Datentypen
        // =========================================

        /*
         * In Java müssen wie Variablen immer einen Datentyp zuweisen.
         * Beispiel: int zahl = 5;
         *
         * Der Typ legt fest, welche Art von Daten gespeichert werden können.
         * Unterschied zu Python: Dort reicht "zahl = 5" ohne Typangabe.
         *
         * Variablennamen werden in camelCase geschrieben,
         * z. B. int meineErsteVariable;
         */

        // ----------------------
        // 2.1 Ganzzahlen (Integer)
        // ----------------------
        byte kleineZahl = 95;                   // 8-bit    -> -128 bis 127
        short mittlereZahl = 1992;              // 16-bit   -> -32768 bis 32767
        int zahl = 123456789;                   // 32-bit   -> -2147483648 bis 2147483647 (Standardtyp für Ganzzahlen)
        long grosseZahl = 4564651651656556L;    // 64-bit

        System.out.println("byte:" + kleineZahl);
        System.out.println("short:" + mittlereZahl);
        System.out.println("int:" + zahl);
        System.out.println("long:" + grosseZahl);

        // ----------------------
        // 2.1 Gleitkommazahlen
        // ----------------------

        float kommaZahl = 5.1234f;      // 32 bit -> f am Ende notwendig
        double temperatur = 21.4158456; // 64 bit -> (Standard für Kommazahlen)

        System.out.println("float: " + kommaZahl);
        System.out.println("double: " + temperatur);

        // ----------------------
        // 2.1 Boolean
        // ----------------------

        boolean isGameRunning = true;
        boolean isAlive = false;

        System.out.println("Wahr: " + isGameRunning);
        System.out.println("Falsch: " + isAlive);

        // -------------------------
        // 2.4 Zeichen (char)
        // -------------------------

        char buchstabe = 'M';
        char integerValue = 77;
        char unicode = '\u004D';

        System.out.println(buchstabe);
        System.out.println(integerValue);
        System.out.println(unicode);

        // -------------------------
        // 2.5 Strings (Text)
        // -------------------------
        // Java unterscheidet zwischen primitiven Datentypen und Klassen.
        // Primitive Typen speichern ihren Wert direkt im Speicher. (int zahl = 5;)
        // Klassen wie String sind Baupläne für Objekte und bringen eigene Methoden mit.
        // Strings sind Folgen von Zeichen/Chars {'M','a','x'} -> Siehe String Klasse

        String name = "Max";
        System.out.println("Mein Name ist: " + name);
        System.out.println("Länge des Strings: " + name.length());

        // -------------------------
        // 2.5 Konstanten
        // -------------------------
        final float PI = 3.1415f;
        System.out.println(PI);

        // Kann nicht überschrieben werden
        // PI = 5.4;

        // =========================================================
        // 3) Deklaration vs. Initialisierung
        // =========================================================

        int number;             // Deklaration: nur Typ + Namen anlegen
        number = 5;             // Initialisierung: Variable bekommt einen Wert zugewiesen

        int andereZahl = 7;     // Deklaration + Initialisierung gleichzeitig
        System.out.println(number);

        // =========================================================
        // 4) Arithmetische Operatoren
        // =========================================================

        /*
         * Operatoren sind Rechenzeichen
         * Beispiele: +, -, *, /, %
         * ++ und -- erhöhen oder verringern eine Zahl um 1
         */

        // -------------------------
        // 4.1 Grundrechenarten
        // -------------------------

        int x = 7;
        int y = 5;

        // Wenn in Java eine Verkettung mit + mit einem String stattfindet, ist das Ergebnis immer ein String
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraktion: " + (x - y));
        System.out.println("Multiplikation: " + x * y);
        System.out.println("Division: " + (x / y));         // 1 (Rest fällt weg)
        System.out.println("Modulo: " + (x % y));           // 2 (nur der Rest wird zurückgegeben)

        // Rechenausdruck vor String funktioniert
        System.out.println(x + y + "Addition: ");

        // -------------------------
        // 4.2 Kurzschreibweisen
        // -------------------------

        int zusatz = 15;
        int z = 8;
        System.out.println(z);

        // 8 + 15
        z = z + zusatz;
        System.out.println(z);

        // Kurzform
        z += zusatz;
        System.out.println(z);

        // -------------------------
        // 4.3 Inkrement & Dekrement
        // -------------------------

        int wert = 10;
        System.out.println("Postinkrement wert++: " + wert++);      // erst Ausgabe, dann +1
        System.out.println("Nach wert++ " + wert);                  // aktueller Wert 11

        System.out.println("Präinkrement ++wert: " + ++wert);       // erst +1, dann Ausgabe
        System.out.println("Nach ++wert " + wert);

        // wert ist aktuell 12
        System.out.println("Postdekrement wert--: " + wert--);
        System.out.println("wert aktuell: " + wert);
        System.out.println("Prädekrement --wert: " + --wert);

        // -------------------------
        // 4.4 Operatorenpräzedenz
        // -------------------------

        // Punkt vor Strich, Klammern haben höchste Priorität
        int result = 3 + 4 * (7 - 5) / 2;
        System.out.println(result);

        // -------------------------
        // 4.5 Rechnen mit double
        // -------------------------

        double da = 7.5;
        double db = 5.0;

        System.out.println("double-Division: " + da / db);

        // Es reicht wenn ein Operand ein float oder double ist, damit das Ergebnis eine Kommazahl wird
        double durchschnitt = 9 / 2.5;
        System.out.println("Durchschnitt :" + durchschnitt);
        System.out.println(9 / 2.5);
        System.out.println(2.5 / 9);

        // Bei zwei Ganzzahlen, kann man eine Variable umwandeln in eine Kommazahl zur Division
        System.out.println(7 / (double)5);

        // -------------------------
        // 4.6 Rechnen mit char
        // -------------------------

        char a = 'A';
        char b = 'A' + 1;
        System.out.println(b);

        char letter = 'C';
        letter++;
        System.out.println("Inkrement mit char: " + letter);

        // -------------------------
        // 4.7 String-Verkettung
        // -------------------------

        String vorname = "Max";
        String nachname = "Mustermann";
        String vollerName = vorname + " " + nachname;

        System.out.println("Verkettung: " + vorname + " " + nachname);
        System.out.println("Verkettung: " + vollerName);



    }
}
