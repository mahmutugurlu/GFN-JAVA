package Aufgaben;

import java.util.Scanner;

public class Aufgabe4 {

    public static void main(String[] args) {

        //Aufgabe 4: Notendurchschnitt mit Bewertung


        Scanner scanner = new Scanner(System.in);

        double[] noten = new double[5];


        for (int i = 0; i < noten.length; i++) {
            System.out.print("Note " + (i + 1) + ": ");
            noten[i] = scanner.nextDouble();
        }


        double summe = 0;

        for (int i = 0; i < noten.length; i++) {
            summe += noten[i];
        }

        // durch
        double durchschnitt = summe / noten.length;


        System.out.printf("Der Durchschnitt ist: %.2f\n", durchschnitt);

        // Bewertungenn
        if (durchschnitt < 2.0) {
            System.out.println("Sehr gut");
        } else if (durchschnitt < 3.0) {
            System.out.println("Gut");
        } else if (durchschnitt < 4.0) {
            System.out.println("Befriedigend");
        } else {
            System.out.println("Verbesserungsbedarf");
        }



    }
}
