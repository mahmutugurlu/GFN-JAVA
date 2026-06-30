import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fehlerbehandlung {
    public static void main(String[] args) {

        /*
         * FEHLERBEHANDLUNG IN JAVA
         * ========================
         * In Java gibt es zwei wichtige Arten von Exceptions:
         *
         * 1) Unchecked Exceptions (Runtime Exceptions)
         *    - treten zur Laufzeit auf
         *    - Compiler zwingt NICHT zur Behandlung
         *
         * 2) Checked Exceptions
         *    - werden vom Compiler geprüft
         *    - MÜSSEN behandelt werden
         */

        // ============================
        // Beispiel 1: Unchecked Exception (Division durch 0)
        // ============================

        int a = 10;
        int b = 0;

        try{
            int c = a / b;
            System.out.println("Ergebnis: " + c);
        } catch (ArithmeticException e){
            System.out.println("Fehler: Division durch 0 nicht erlaubt! " + e);
        }

        // ============================
        // Beispiel 2: Checked Exception (Datei mit Scanner einlesen)
        // ============================

        // - Wir wollen eine Textdatei lesen
        // - Die Datei könnte aber fehlen
        // - Deshalb zwingt uns Java zur Fehlerbehandlung


//        Scanner fileScanner = null;
//
//        try{
//            fileScanner = new Scanner(new File("daten.txt"));
//            System.out.println("Datei erfolgreich geöffnet");
//        } catch (FileNotFoundException e){
//            System.out.println("Fehler: Datei nicht gefunden");
//        } finally {                         // Dieser Block wird IMMER ausgeführt
//            if (fileScanner != null){
//                fileScanner.close();
//            }
//        }

        // try-with-resources -> Hier brauchen wir kein finally um den Stream zu schließen
        try (Scanner fileScanner = new Scanner(new File("daten.txt"))) {
            System.out.println("Datei erfolgreich geöffnet");
        } catch (FileNotFoundException e) {
            System.out.println("Fehler: Datei nicht gefunden");
        }                         // Dieser Block wird IMMER ausgeführt
    }
}

