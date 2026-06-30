import java.io.Serial;
import java.util.Arrays;

public class ArraysTutorial {
    public static void main(String[] args) {

        /*
         * ARRAYS
         * ======
         * In Java gibt es Arrays, um mehrere Werte desselben Datentyps
         * in einer festen Reihenfolge zu speichern.
         * -> Ein Array hat IMMER eine feste Länge, die nicht verändert werden kann.
         * -> Alle Elemente im Array haben denselben Datentyp.
         * -> Man greift mit einem Index (Position) auf die Elemente zu, beginnend bei 0.
         *
         * Syntax: Datentyp[] name = new Datentyp[groesse];
         * Beispiel: int[] zahlen = new int[5];  // Array mit 5 int-Werten (alle starten mit 0)
         */

        // 1. Array erstellen und Werte zuweisen
        int[] zahlen = new int[5];
        zahlen[0] = 10;
        zahlen[1] = 20;
        zahlen[2] = 30;
        zahlen[3] = 40;
        zahlen[4] = 50;

        // 2. Array direkt mit Werten befüllen
        String[] namen = {"Max", "Alexander", "Kai"};

        // 3. Zugriff auf Elemente
        System.out.println("Erstes Element im Zahlen-Array: " + zahlen[0]);
        System.out.println("Zweite Element im Namen-Array: " + namen[1]);

        // 4. Länge eines Arrays herausfinden
        System.out.println("Länge des Arrays zahlen: " + zahlen.length);

        // 5. Arrays mit Schleifen durchlaufen
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println("Index " + i + ": " + zahlen[i]);
        }

        // 6. Erweiterte For Schleife (for-each)
        for (String name : namen){
            System.out.println(name);
        }

        // 7. Array mit toString() Methode ausgeben
        System.out.println(Arrays.toString(zahlen));

        // 8. Werte im Array sortieren
        int[] zahlenListe = {5, 1, 23, 4, 7, 3, 12};
        Arrays.sort(zahlenListe);
        System.out.println("Sortiert: " + Arrays.toString(zahlenListe));

        // Array absteigend sortieren
        for (int i = zahlenListe.length - 1; i >= 0; i--) {
            System.out.println(zahlenListe[i]);
        }

        // 9. Kopie eines Arrays erzeugen
        int[] erweitert = Arrays.copyOf(zahlenListe, zahlenListe.length + 3);
        System.out.println("Erweitert " + Arrays.toString(erweitert));

        /*
         * MULTIDIMENSIONALE ARRAYS
         * =======================
         * Mehrdimensionale Arrays sind Arrays, deren Elemente selbst wieder Arrays sind.
         * Am gebräuchlichsten sind 2D-Arrays (z.B. Tabellen/Raster).
         *
         * Einsatz: Bildverarbeitung (Pixel), Spiele (Spielfelder), Matrizen (Mathe),
         * Tabellen/Daten, Simulationen (Gitter), Netzwerke (Graphen)
         *
         * Syntax (2D-Array): Datentyp[][] name = new Datentyp[zeilen][spalten];
         * Beispiel: int[][] matrix = new int[3][4]; // 3 Zeilen, 4 Spalten
         *
         * Zugriff: matrix[row][col]
         */

        // 2D-Array erstellen (Matrix 3x3) und Werte zuweisen
        int[][] matrix = new int[3][3];

        // Erste Reihe befüllt
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        // Zweite Reihe befüllt
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        // Dritte Reihe befüllt
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        //              | Spalte 0 | Spalte 1 | Spalte 2 |
        //      -----------------------------------------
        //      Reihe 0 |    1     |    2     |    3     |
        //      Reihe 1 |    4     |    5     |    6     |
        //      Reihe 2 |    7     |    8     |    9     |

        // Ausgabe der Matrix mit verschachtelten Schleifen
        // Die verschachtelte Schleife durchläuft:
        // 1. Jede Zeile (row)
        //          2. Jede Spalte innerhalb der Zeile (col)

        System.out.println("Matrix (3x3) Ausgabe: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println(matrix[row][col]);
            }
            System.out.println();
        }



        // Ein Array speichert mehrere Werte desselben Datentyps an nummerierten Positionen.
        // Mit einer for-Schleife läuft man diese Positionen nacheinander ab. Die Laufvariable i
        // ist dabei der aktuelle Index und farben[i] liefert den Wert, der an dieser Position gespeichert ist.


    }
}
