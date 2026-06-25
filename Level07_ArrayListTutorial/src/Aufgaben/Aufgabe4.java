package Aufgaben;

import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe4 {

    public static void main(String[] args) {


  // Aufgabe 4: Warenkorb

            Scanner scanner = new Scanner(System.in);

        System.out.println("Wähle eine Option:\n" +
                "1 - Produkt hinzufuegen\n" +
                "2 - Produkt entfernen\n" +
                "3 - Warenkorb anzeigen\n" +
                "4 - Beenden\n");

        int wahl = scanner.nextInt();
        //String waren = scanner.next();


        ArrayList<String> einkaufsliste = new ArrayList<>();

        if(wahl==1|| wahl==2 ||wahl==3 || wahl==4) {
            System.out.println("Deine Wahl: " + wahl);

            if (wahl == 1) {
                System.out.println("Welches Produkt moechtest du hinzufuegen?");
                String waren = scanner.next();
                einkaufsliste.add(waren);
                System.out.println( waren + "  wurde hinzugefuegt. ");
                System.out.println(einkaufsliste);
            }

            if (wahl == 2) {
                System.out.println("Welches Produkt moechtest du entfernen?");
                String waren = scanner.next();
                einkaufsliste.remove(waren);
                System.out.println(einkaufsliste);
            }

            if (wahl == 3) {
                System.out.println(" Warenkorg wird angezeigt : " + einkaufsliste);


            }

            if (wahl == 4) {

                System.out.println("beenden");

                //break;

            }




        }
        else {
            System.out.println("Ungültige Wahl ");
        }


        /*

        import java.util.ArrayList;
import java.util.Scanner;

public class WarenkorbApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> einkaufsliste = new ArrayList<>();

        boolean running = true;

        while (running) {

            // Menü gösterimi
            printMenu();

            int wahl = scanner.nextInt();

            switch (wahl) {

                case 1:
                    addProdukt(scanner, einkaufsliste);
                    break;

                case 2:
                    removeProdukt(scanner, einkaufsliste);
                    break;

                case 3:
                    showWarenkorb(einkaufsliste);
                    break;

                case 4:
                    System.out.println("Programm wird beendet...");
                    running = false;
                    break;

                default:
                    System.out.println("Ungueltige Wahl!");
            }
        }

        scanner.close();
    }

    // Menü metodu
    private static void printMenu() {
        System.out.println("\nWähle eine Option:");
        System.out.println("1 - Produkt hinzufuegen");
        System.out.println("2 - Produkt entfernen");
        System.out.println("3 - Warenkorb anzeigen");
        System.out.println("4 - Beenden");
    }

    private static void addProdukt(Scanner scanner, ArrayList<String> liste) {
        System.out.println("Welches Produkt moechtest du hinzufuegen?");
        String produkt = scanner.next();
        liste.add(produkt);

        System.out.println(produkt + " wurde hinzugefuegt.");
    }

    private static void removeProdukt(Scanner scanner, ArrayList<String> liste) {
        System.out.println("Welches Produkt moechtest du entfernen?");
        String produkt = scanner.next();

        if (liste.remove(produkt)) {
            System.out.println(produkt + " wurde entfernt.");
        } else {
            System.out.println("Produkt nicht gefunden!");
        }
    }

    private static void showWarenkorb(ArrayList<String> liste) {
        if (liste.isEmpty()) {
            System.out.println("Warenkorb ist leer.");
        } else {
            System.out.println("Warenkorb: " + liste);
        }
    }
}
         */

    }
}
