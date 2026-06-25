import java.time.LocalDateTime;
import java.util.Scanner;

public class Verzweigungen {

    public static void main(String[] args) {

        // ========================
        // 1) Vergleichsoperatoren
        // ========================

        int a = 5;
        int b = 8;

        System.out.println("a == b: " + (a == b));       // Ist a genau gleich b?
        System.out.println("a != b: " + (a != b));       // Ist a ungleich b?
        System.out.println("a > b: " + (a > b));         // Ist a größer b?
        System.out.println("a >= b: " + (a >= b));       // Ist a größer oder gleich b?
        System.out.println("a < b: " + (a < b));         // Ist a kleiner b?
        System.out.println("a <= b: " + (a <= b));       // Ist a kleiner oder gleich b?

        // =========================
        // 2) If / else / else if
        // =========================
        /*
         * If-Bedingungen werden verwendet, um Entscheidungen im Code zu treffen.
         * Der Code prüft eine Bedingung (true oder false).
         * - if: wird ausgeführt, wenn die Bedingung wahr ist
         * - else if: prüft weitere Bedingungen, falls vorherige false waren
         * - else: wird ausgeführt, wenn keine der Bedingungen zutrifft
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib dein Alter ein: ");
        int alter = scanner.nextInt();

        if (alter >= 18){                   // Wenn alter größer oder gleich 18 ist, dann führe diesen Code aus
            System.out.println("Du bist volljährig!");
        } else {                            // In jedem anderen Fall, führe diesen Code aus
            System.out.println("Du bist nicht volljährig");
        }


        System.out.println("Bitte gib eine Note (1-6) ein: ");
        int note = scanner.nextInt();

        if (note == 1)
        {
            System.out.println("Sehr gut");
        }
        else if (note == 2)
        {                      // wie elif in Python
            System.out.println("Gut");
        }
        else if (note == 3)
        {
            System.out.println("Befriedigend");
        }
        else if (note == 4)
        {
            System.out.println("Ausreichend");
        }
        else if (note == 5)
        {
            System.out.println("Mangelhaft");
        }
        else
        {
            System.out.println("Ungenügend");
        }

        int x = 8;
        int y = 7;

        // Auch möglich aber seltener genutzt (LZK)
        // If Bedingung ohne Klammern, wenn nur ein Statement/Befehl in einer Zeile ausgeführt werden soll
        if (x == y) System.out.println("x ist genau gleich y");
        else if (x != y) System.out.println("x ist nicht gleich y");

        // =========================
        // 3) Logische Operatoren
        // =========================

        // In Python: AND, OR, NOT
        // In Java: &&, ||, !

        boolean hatFuehrerschein = false;
        boolean besitztFahrzeug = true;

        // Logische UND Verknüpfung
        if (hatFuehrerschein && besitztFahrzeug){
            System.out.println("Viel Spaß beim Autofahren!");
        }

        // Verneinung
        if (!hatFuehrerschein){
            System.out.println("Du hast keinen Führerschein!");
        }

        // Logische ODER Verknüpfung
        double temperatur = 23.5;

        if (temperatur < 20 || temperatur > 30){
            System.out.println("Unangenehm");
        } else {
            System.out.println("Angenehm, pack die Badehose aus!");
        }

        // Vergleiche in Java nicht mit primitiven Datentypen

        String passwort = "Passwort123";
        String nutzereingabe = scanner.next();

        if (passwort.equals(nutzereingabe)){
            System.out.println("Passwort korrekt");
        }

        // =========================
        // 4) Switch / Enhanced Switch
        // =========================

        System.out.println("Bitte gib eine Zahl von 1 bis 3 ein: ");
        int zahl = scanner.nextInt();

        // Switch
        switch (zahl){
            case 1:
                System.out.println("Du hast die 1 gewählt");
                break;
            case 2:
                System.out.println("Du hast die 2 gewählt");
                break;
            case 3:
                System.out.println("Du hast die 3 gewählt");
                break;
            default:
                System.out.println("Ungültige Eingabe");
        }

        // Enhanced Switch
        switch (zahl){
            case 1 -> System.out.println("Du hast die 1 gewählt");
            case 2 -> System.out.println("Du hast die 2 gewählt");
            case 3 -> System.out.println("Du hast die 3 gewählt");
            default -> System.out.println("Ungültige Eingabe");
        }

        int hour = LocalDateTime.now().getHour();
        System.out.println(hour);

        String gruss = switch (hour){
            case 5, 6, 7, 8, 9, 10 -> "Guten Morgen";
            case 18, 19, 20, 21 -> "Guten Abend";
            case 22, 23, 0, 1, 2, 3, 4 -> "Guten Nacht";
            default -> "Guten Tag";
        };
        System.out.println(gruss);


        // =========================
        // 5) Ternary Operator / Ternäre Operator
        // =========================
        // Aufbau: (Bedingung) ? WertWennWahr : WertWennFalsch

        int playerLives = 1;
        String gameStatus = (playerLives <= 0) ? "GAME OVER" : "Spiel läuft...";
        System.out.println(gameStatus);


    }
}
