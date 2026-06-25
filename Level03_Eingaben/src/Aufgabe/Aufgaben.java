package Aufgabe;

import java.util.Scanner;

public class Aufgaben {
    public static void main(String[] args) {

/*

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie heißen Sie? ");

        String name = scanner.next();

        System.out.print("Wie alt bist du? ");

        int alt  = scanner.nextInt();

        System.out.print("Hallo " + name + " , " + "du bist " + alt + " Jahre alt ! " );


        */



        System.out.println(" ******************************************************************************* ");

        // Aufgabe 2: Warenkorb

     /*   Scanner scanner = new Scanner(System.in);

        System.out.print("Welschen Artikel möchten Sie kaufen? ");

        String produktName = scanner.next();

        System.out.print(" Was kostet der Artikel?  ");

        double preis = scanner.nextDouble();

        System.out.print(" Wie viele Stueck moechtest du kaufen?  ");

        int stück = scanner.nextInt();

        System.out.println(" Du hast " + stück + "x " +  produktName + "  gekauft.");

        System.out.println(" Der Gesamtpreis ist " + (stück* preis) + " EUR ");  */


        System.out.println(" ************************************************************************** ");


        //Aufgabe 3: Notendurchschnitt

        /*
        Scanner scanner = new Scanner(System.in);

       // System.out.print(" Gib drei Noten ein: \n");

        System.out.print(" Gib erster Not ein: ");
        double note1 = scanner.nextDouble();

        System.out.print(" Gib zweiter Not ein: ");
        double note2 = scanner.nextDouble();


        System.out.print("Gib dritte Note ein: ");


        double note3 = scanner.nextDouble();

        double durch = (note1 + note2 + note3) / 3;

        System.out.printf("Der Durchschnitt ist: %.2f", durch); */



        System.out.println(" ************************************************************************** ");

        /*

        String textAlter = "28";
        int parsedInt = Integer.parseInt(textAlter);
        System.out.println(parsedInt);
        String textGroesse = "1.75";
        double parsedDouble = Double.parseDouble(textGroesse);
        System.out.println( parsedDouble);

        String textAktiv = "true";
        boolean parsedBool = Boolean.parseBoolean(textAktiv);
        System.out.println( parsedBool);

        System.out.println("Alter: " + parsedInt + " \n" + " Groesse:   " + parsedDouble + " \n" + " Aktiv:  " + parsedBool + " \n" +
                " Geburtsjahr:  " + (2026-parsedInt) + " \n" +
                "Groesse^2:  " + (parsedDouble*parsedDouble)); */



        System.out.println(" ************************************************************************** ");




        //Bandnamen

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Willkommen beim Bandnamen-Generator! ");

        System.out.println(" In welcher Stadt bist du aufgewachsen? ");

        String geburtsStadt = scanner.next();

        String bandnamenStadt = geburtsStadt + "er";

        System.out.println(" Was ist dein Lieblingstier (auf Englisch)? ");

        String lieblingstierName = scanner.next();

        String bandnamenTier = lieblingstierName + "s";

        System.out.println("Dein moeglicher Bandname ist: " + bandnamenStadt + " " + bandnamenTier);




        System.out.println(" ************************************************************************** ");


        //  Wrapper-Konstanten erkunden



                System.out.println("=== Wertebereiche ===");

                // Integer
                System.out.println("Integer: " + Integer.MIN_VALUE + " bis " + Integer.MAX_VALUE);

                // Long
                System.out.println("Long: " + Long.MIN_VALUE + " bis " + Long.MAX_VALUE);

                // Double
                System.out.println("Double: " + Double.MIN_VALUE + " bis " + Double.MAX_VALUE);

                // Anzahl möglicher Integer-* - Werte berechnen
                long anzahlInteger = (long) Integer.MAX_VALUE - (long) Integer.MIN_VALUE + 1;

                System.out.println("Anzahl möglicher Integer-Werte: " + anzahlInteger);





    }
}
