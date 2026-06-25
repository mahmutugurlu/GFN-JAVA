package Aufgaben;

public class Aufgabe2 {

    public static void main(String[] args) {

        //Aufgabe 2: Summe eines Arrays

        int[] zahlen = {2, 4, 6, 8, 10};

        int summe = 0;

        for (int i = 0;  i < zahlen.length  ; i++) {

            summe = summe+ zahlen[i];

        }
        System.out.println("Summe: " + summe);

    }
}
