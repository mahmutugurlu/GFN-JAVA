package Aufgaben;

import java.util.Scanner;

public class Aufgaben4 {

    public static void main(String[] args) {

        //Aufgabe 4: Wochentag mit switch

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib eine Zahl von 1 bis 7 ein: ");
        int zahl = scanner.nextInt();

        // Switch
        switch (zahl){
            case 1:
                System.out.println(" Montag ");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println(" Mittwoch ");
                break;
            case 4:
                System.out.println(" Donerstag ");
                break;
            case 5:
                System.out.println(" Freitag ");
                break;
            case 6:
                System.out.println(" Samstag ");
                break;
            case 7:
                System.out.println(" Sonntag ");
                break;
            default:
                System.out.println("Ungültige Eingabe");
        }

        // Enhanced Switch
        switch (zahl){
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Sali");
            case 3 -> System.out.println("Carsamba");
            case 4 -> System.out.println("Persembe");
            case 5 -> System.out.println(" Cuma ");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println(" Pazar ");
            default -> System.out.println("Ungültige Eingabe");
        }

    }
}
