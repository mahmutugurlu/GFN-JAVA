package Aufgaben;

import java.util.Scanner;

public class Aufgabe2 {

    public static void main(String[] args) {

        //Aufgabe 2: Gerade oder ungerade

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Bitte gib eine Zahl ein: ");

        int zahl = scanner.nextInt();

        if (zahl%2==0) {
            System.out.println(" gerade Zahl ");

        } else {

            System.out.println(" ungerade Zahl ");


        }
    }
}
