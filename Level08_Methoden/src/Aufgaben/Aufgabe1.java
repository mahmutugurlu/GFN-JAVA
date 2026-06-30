package Aufgaben;

import java.util.Arrays;

public class Aufgabe1 {


    public static void main(String[] args) {

        begrüßen("Mustafa" );

        double f = temperaturRechner(0.0,1.8,32);
        System.out.println("F: " + f);

        double deutschland = temperaturRechner(100.0,1.8,32);
        System.out.println("F: " + deutschland);

        zahlen(2.5,7.8);
        zahlen(3,5);
        zahlen(4,9,3);






    }





    static void begrüßen(String name) {

        System.out.println("Hallo " + name + ", " + "schön dich zu sehen !");

    }

   //Aufgabe 2: Temperaturrechner als Methode
    static double temperaturRechner(double c, double k, double z) {

        return c*k+z;
    }


    //Aufgabe 3: Methodenueberladung

    static void zahlen (double a, double b){

        System.out.println("Groesseres von 2.5 und 7.8: " + b);
    }



    static void zahlen (int a, int b){

        System.out.println("Groesseres von 5 und 3: " + b);
    }


    static void zahlen (int a, int b, int c){

        System.out.println("Groesseres von 4, 9 und 3: " + b);
    }






}
