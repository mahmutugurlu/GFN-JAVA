public class Methoden {

    // =========================
    // METHODEN IN JAVA
    // =========================
    // Methoden fassen wiederverwendbaren Code zusammen.
    // -> verhindern doppelten Code
    // -> machen Programme übersichtlicher
    // -> können Werte entgegennehmen und/oder zurückgeben
    //
    // AUFBAU / SYNTAX EINER METHODE
    // [Sichtbarkeit] [static] Rückgabetyp Methodenname(Parameterliste) {
    //     // Methodenrumpf (Code, der ausgeführt wird)
    //     return Wert;   // nur nötig, wenn Rückgabetyp angegeben wird
    // }

    // =========================
    // WARUM static?
    // =========================
    // static = Hilfsmittel für den Anfang.
    // Ohne es meckert Java. Mit ihm funktioniert alles wie erwartet.
    //
    // Ohne static müsste man erst ein Objekt erstellen, z.B.:
    // Methoden meinObjekt = new Methoden(); (Unsere aktuelle Klasse)
    // meinObjekt.hallo();
    //
    // Mit static können wir die Methode einfach so aufrufen:
    // Methoden.hallo();
    // oder wenn wir uns schon in der Klasse befinden einfach hallo();


    public static void main(String[] args) {

        hallo();

        begruessung("Daniel");

        int ergebnis = addiere(5, 7);
        System.out.println("5 + 7 = " + ergebnis);
        System.out.println("5 + 7 = " + addiere(5, 7));

        System.out.println("Fläche: " + berechneFlaecheRechteck(7.5, 4.0));

        // Methodenüberladung
        System.out.println("Quadrat von 4: " + quadrieren(4));
        System.out.println("Quadrat von 3.0: " + quadrieren(3.0));
    }

    // 1. Methode ohne Parameter und ohne Rückgabewert
    static void hallo(){
        System.out.println("Hallo, ich bin eine Methode!");
    }

    // 2. Methode mit Parameter, aber ohne Rückgabewert
    static void begruessung(String name){
        System.out.println("Hallo " + name + " schön, dass du da bist!");
    }

    // 3. Methode mit Parameter und Rückgabewert
    static int addiere(int a, int b){
        return a + b;
    }

    // 4. double-Rückgabewert
    static double berechneFlaecheRechteck(double breite, double hoehe){
        return breite * hoehe;
    }

    // Methodenüberladung
    // Gleicher Name, unterschiedliche Parameterliste
    static int quadrieren(int zahl){
        return zahl * zahl;
    }

    static double quadrieren(double zahl){
        return zahl * zahl;
    }

}
