package Aufgaben;

import java.util.ArrayList;
import java.util.Collections;

public class Aufgabe2 {

    public static void main(String[] args) {

        //Aufgabe 2: Highscore-Liste

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(850);
        scores.add(1200);
        scores.add(430);
        scores.add(975);
        scores.add(1500);
        scores.add(620);

        System.out.println("Original : " + scores );

        // Liste aufsteigend sortieren
        Collections.sort(scores);
        System.out.println("Liste aufsteigend sortieren " + scores);


        // Liste absteigend sortieren
        Collections.reverse(scores);
        System.out.println("Liste absteigend sortieren: " + scores);

       // Index von 850 (absteigend):

        scores.indexOf(850);
        System.out.println("ndex von 850 (absteigend): " + scores.indexOf(850));

        //

        scores.set(5,900);
        System.out.println("Set 900 : " + scores);




    }
}
