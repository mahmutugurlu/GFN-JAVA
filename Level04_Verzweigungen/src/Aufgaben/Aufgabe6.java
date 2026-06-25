package Aufgaben;

import java.util.Scanner;

public class Aufgabe6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Bitte geben Sie zwei Zahlen ein");

        System.out.println(" Geben Sie erste Zahl ein");
        double zahl1 = scanner.nextDouble();

        System.out.println(" Geben Sie zweite Zahl ein");
        double zahl2 = scanner.nextDouble();

        System.out.println("Geben Sie ein Zeichen ein");
        char zeichen = scanner.next().charAt(0);

        if (zeichen=='*' || zeichen=='/'  || zeichen=='+' || zeichen=='-'){


        switch (zeichen){
            case '+'->
            {
                if (zeichen=='+'){
                    System.out.println(zahl2+zahl1);
                }
            }

            case '-' ->
            {
                if (zeichen=='-'){
                    System.out.println(zahl2-zahl1);
                }
            }
            case '/' ->
            {
                if (zeichen=='/' && zahl1!=0){
                    System.out.println(zahl2/zahl1);
                }
                else {
                    System.out.println("Fehler: Division durch 0 ist nicht erlaubt.");
                }
            }
            case '*' ->
            {
                if (zeichen=='*'){
                    System.out.println(zahl2*zahl1);
                }
            }

           // default -> System.out.println(" Unbekannte Operation:  " + zeichen);
        }


    }

    else {
            System.out.println(" Unbekannte Operation:  " + zeichen);
        }




    }
}
