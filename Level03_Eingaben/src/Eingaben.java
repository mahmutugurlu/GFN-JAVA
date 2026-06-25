import java.util.Scanner;

public class Eingaben {

    /*Das liegt daran, wie Java Zahlen auf Bit-Ebene verarbeitet und kürzt. Wenn du einen int (32 Bit) in einen short (16 Bit) castest,
    schneidet Java einfach die vorderen 16 Bit ab und behält nur die hinteren 16 Bit.

    Hier ist die genaue mathematische und binäre Aufschlüsselung, wie aus 123456789 der Wert -13035 wird:
            1. Umwandlung in Binärcode

    Zuerst schauen wir uns an, wie die Zahl 123456789 als 32-Bit-Integer im Speicher aussieht:

    Dezimal: 123456789

    Binär (32 Bit): 0000 0111 0101 1011 1100 1101 0001 0101

            2. Der Cast auf short (Abschneiden der Bits)

    Ein short in Java hat nur 16 Bit. Durch den Cast (short) werden die ersten 16 Bit der 32-Bit-Zahl ignoriert.
    Es bleiben nur die niedrigsten (rechten) 16 Bit übrig:

    Abgeschnittene Bits: 0000 0111 0101 1011 (gelöscht)

    Verbleibende 16 Bit: 1100 1101 0001 0101

            3. Interpretation als negative Zahl (Zweierkomplement)

    Das verbleibende Bitmuster ist 1100 1101 0001 0101. Da das allererste Bit (das Vorzeichenbit) eine 1 ist, weiß Java,
    dass es sich um eine negative Zahl im Zweierkomplement handelt.

    Um herauszufinden, welcher negative Dezimalwert das ist, rechnet man das Zweierkomplement zurück:

    Bits invertieren (alle 0 zu 1 und 1 zu 0 machen):
            0011 0010 1110 1010

            1 addieren:
            0011 0010 1110 1011

    Wenn man dieses invertierte Bitmuster (0011 0010 1110 1011) in eine Dezimalzahl umrechnet, erhält man:
            213+212+29+27+26+25+23+21+20
            =8192+4096+512+128+64+32+8+2+1=13035

    Da das Vorzeichenbit ursprünglich 1 war, ist das Ergebnis negativ: -13035.
    Der mathematische Kurzweg

    Man kann das Ganze auch ohne Binärcode über die Modulo-Arithmetik für den Wertebereich eines short (−32768 bis 32767,
     insgesamt 65536 mögliche Werte) berechnen:

            123456789(mod65536)=52501

    Da 52501 größer ist als das Maximum von short (32767), wird die Zahl negativ, indem man die Gesamtanzahl der Werte abzieht:

            52501−65536=−13035 */

    public static void main(String[] args) {

        // ==============================
        // 1) Eingabe / Input mit Scanner
        // ==============================
        /*
         * Der Scanner kann Eingaben von der Tastatur lesen.
         *  -> Er liest standardmäßig von System.in (der Tastatureingabe)
         *
         * Warum müssen wir Scanner importieren, String aber nicht?
         *  -> Java stellt das Paket java.lang (z.B. String, System, Math) automatisch bereit
         *  -> Alle anderen Pakete wie java.util müssen explizit importiert werden
         */

        // Mit dem Schlüsselwort new wird ein Objekt einer Klasse erzeugt
        // Scanner ist der Datentyp, scanner ist der Name der Variablen, new erzeugt das Objekt
        Scanner scanner = new Scanner(System.in);       // System.in = Tastatureingabe

        // --------------- Eingabe von Text (String) ---------------
        System.out.print("Bitte gib deinen Namen ein: ");
        String name = scanner.next();
        System.out.println("Hallo " + name);

        // --------------- Eingabe eines Zeichens (char) ---------------
        System.out.print("Bitte gib einen Buchstaben ein: ");
        char buchstabe = scanner.next().charAt(0);
        System.out.println("Du hast " + buchstabe + " eingegeben");

        // ------------- Eingabe einer ganzen Zahl -----------------
        System.out.print("Bitte gib eine ganze Zahl ein: ");
        int zahl = scanner.nextInt();
        System.out.println("Die Zahl lautet: " + zahl);

        // ------------- Eingabe einer Kommazahl -----------------
        // Hinweis: Variablen vom Typ double werden mit einem Punkt und nicht einem Komma initialisiert
        // Über den Scanner werden Kommazahlen mit einem Komma eingegeben (Je nach Locale)
        System.out.print("Bitte gib eine Kommazahl ein: ");
        double kommaZahl = scanner.nextDouble();
        System.out.println("Die Kommazahl lautet: " + kommaZahl);

        // ------------- Eingabe eins Wahrheitswertes -----------------
        System.out.print("Bitte gib true oder false ein: ");
        boolean wahrheitswert = scanner.nextBoolean();
        System.out.println("Dein Wert: " + wahrheitswert);

        // ==========================================
        // 2) Wrapper-Klassen
        // ==========================================
        /*
         * Für jeden primitiven Datentyp gibt es eine passende Wrapper-Klasse:
         * byte -> Byte, short -> Short, int -> Integer, long -> Long,
         * float -> Float, double -> Double, char -> Character, boolean -> Boolean
         *
         * -> Wrapper sind Objekte und bieten nützliche Methoden & Konstanten.
         * -> Primitive sind reine Werte (keine Objekte).
         */

        int primitiv = 42;
        Integer wrapper = Integer.valueOf(primitiv);
        System.out.println(wrapper.intValue());

        // Autoboxing / Unboxing
        Integer autoBoxed = 42;             // Autoboxing: automatisch von int zu Integer
        int unboxed = autoBoxed;            // Unboxing: automatisch von Integer zu int

        System.out.println("Autoboxed: " + autoBoxed);
        System.out.println("Unboxed: " + unboxed);

        System.out.println("Maximaler Integer-Wert: " + Integer.MAX_VALUE);
        System.out.println("Minimaler Integer-Wert: " + Integer.MIN_VALUE);


        // ==========================================
        // 3) Casting (Typkonvertierung)
        // ==========================================
        /*
         * Casting bedeutet, einen Wert in einen anderen Datentyp umzuwandeln.
         * Dabei wird der Wert ggf. verändert oder abgerundet.
         */

        // Widening
        // von einem kleineren Datentyp in einen größeren Datentyp
        // byte -> short -> char -> int -> long -> float -> double

        int basisZahl = 100;
        double widened = basisZahl;
        System.out.println("Automatische Umwandlung int -> double: " + widened);

        // Narrowing
        // von einem größeren Datentyp in einen kleineren Datentyp
        // double -> float -> long -> int -> char -> short -> byte

        double kommmaZahl = 9.78;
        int narrowed = (int)kommmaZahl;          // Rest hinter dem Komma fällt weg
        System.out.println("Automatische Umwandlung double -> int: " + narrowed);

        // Sorgt aber für Probleme, wenn die Werte der größeren Datentypen größer sind, als der Zieldatentyp
        // Die kleineren Datentypen laufen über
        int grosseZahl = 123456789;
        short kleineZahl = (short)grosseZahl;
        System.out.println(kleineZahl);
        System.out.println(Short.MAX_VALUE);

        // ==========================================
        // 4) Parsing (Text in Datentyp umwandeln)
        // ==========================================
        /*
         * Parsing = Umwandeln von Text (String) in echte Werte.
         * Wichtig, wenn Eingaben als Text vorliegen (z. B. aus Dateien oder Eingabefeldern).
         */

        String textZahl = "123";
        int parsedInt = Integer.parseInt(textZahl);
        System.out.println("Text als Zahl " + parsedInt);

        String textDouble = "3.1415";
        double parsedDouble = Double.parseDouble(textDouble);
        System.out.println("Text als Double: " + parsedDouble);

        // ==========================================
        // 5) String Conversion (Datentyp in Text umwandeln)
        // ==========================================
        /*
         * String Conversion ist das Gegenteil von Parsing:
         * Parsing           = String -> Datentyp  (z.B. Integer.parseInt())
         * String Conversion = Datentyp -> String  (z.B. String.valueOf())
         */

        int ganzeZahl = 42;
        String vonInt = String.valueOf(ganzeZahl);
        System.out.println("int -> String " + (vonInt + 5));

        // Alternativ
        String vonIntWrapper = Integer.toString(ganzeZahl);
        System.out.println("Integer.toString(): " + vonIntWrapper + 5);

        // ==========================================
        // 5) Nutzereingabe einlesen und passend umwandeln
        // ==========================================
        /*
         * scanner.nextInt() funktioniert hier, aber in der Praxis liefern viele
         * Eingabequellen immer einen String, z.B. Textfelder in GUI-Anwendungen.
         * Das Parsen ist dann zwingend notwendig und kein Umweg.
         */

        System.out.println("Bitte gib eine ganze Zahl ein: ");
        String eingabeZahl = scanner.next();
        int umgewandelteZahl = Integer.parseInt(eingabeZahl);
        System.out.println("Text als int: 10" + (umgewandelteZahl + 5));

        // Best Practice
        // Sobald der Scanner einmal geschlossen wurde, kann kein neuer Scanner erstellt werden
        scanner.close();
    }

}
