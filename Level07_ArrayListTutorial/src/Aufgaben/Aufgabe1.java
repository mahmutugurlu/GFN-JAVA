package Aufgaben;

import java.util.ArrayList;

public class Aufgabe1 {

    public static void main(String[] args) {


        ArrayList<Double> zahl  = new ArrayList<>();

        zahl.add(36.2);
        zahl.add(23.5);
        zahl.add(27.5);
        zahl.add(29.5);
        zahl.add(28.5);

        System.out.println(zahl);

        double sum = 0.0;

        for (int i = 0; i < zahl.size(); i++) {

            sum = sum+zahl.get(i);

        }

        System.out.println(" Die Summe aller Zahlen betraegt: " + sum);


    }
}
