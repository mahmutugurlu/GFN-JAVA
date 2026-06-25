package Aufgaben;

import java.util.Scanner;

public class Aufgabe3 {

    public static void main(String[] args) {

        //Aufgabe 3: Kinokontroll

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Bitte gib dein Alter ein: ");

        int alter = scanner.nextInt();
        boolean erlaub=true;
        boolean keinErlaub=false;

        if (alter >= 16) {
            System.out.println(" Sie dürfen eintreten. ");
        } else if (alter>=12) {
            System.out.println(" Bist du in Begleitung eines Erwachsenen (true/false)? " + erlaub);;
            System.out.println(" Zutritt erlaubt. ");




        } else {

            System.out.println(" Kein Zutritt erlaubt. " + keinErlaub);


        }

    }
}
