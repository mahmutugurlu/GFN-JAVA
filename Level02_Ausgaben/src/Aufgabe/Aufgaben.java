package Aufgabe;

public class Aufgaben {

    public static void main(String[] args) {

    //Aufgabe 1: Fehlersuche

                System.out.println("Hallo");
                System.out.printf("Wert: %f %n", 3.14);
                System.out.print("Hello World \n");


        System.out.println(" *************************************************** ");

        //Aufgabe 2: Konkatenationsfallen

        System.out.println("Erste Ausgabe:  " + 55 + 55); // Als erste Datatyp gibt es String, deswegen wird alle Werte verkettet
        System.out.println(+ 55 + 55 + " Zweite Ausgabe:  " ); // Als erste Datatyp gibt es String, deswegen wird bis String addiert , dann verkettet
        System.out.println(" Zweite Ausgabe:  " +(55+55) );

        System.out.println(" *************************************************** ");

        //Aufgabe 3: Ausgabe ohne Zeilenumbruch

        String a = " Java ";
        String b = " ist ";
        String c = " cool! ";


        System.out.print(a);
        System.out.print(b);
        System.out.print(c + "\n");


        System.out.println(" *************************************************** ");

        //Aufgabe 4: Escape-Zeichen in der Praxis

        String pfad= " C:\\Projekte\\Java\\aufgabe.java";
        String autor= "Peter Schmidt";
     String    datum="17-04-2026";
     String    notiz="Bitte nicht löschen!";
     //   Notiz: "Bitte nicht löschen!"

        System.out.printf("Pfad: %10s%n", pfad);
        System.out.printf("Autor: %10s%n", autor);
        System.out.printf("Datum: %10s%n", datum);
        System.out.printf("Notiz: %10s%n", notiz);



        System.out.println(" *************************************************** ");

        //Aufgabe 5: Formatierte Benutzerinfo








    }
}
