package Aufgaben;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe3 {

    public static void main(String[] args) {


        //Aufgabe 3: Namen durchsuchen





        Scanner  scanner = new Scanner(System.in);

        String[] namen = {"Anna", "Max", "Tom", "Lisa"};

        System.out.println("Bitte gib einen Namen ein:  ");
        String name  = scanner.next();

        boolean gefunden = false;

        for (int i = 0; i < namen.length; i++) {

            for (int j = 0; j < i; j++) {

                if (namen[i].equals(name)){
                    System.out.println(name + " wurde im Array gefunden.");
                    gefunden = true;
                    break;
                }else {
                    break;
                }
            }
        }

        if (!gefunden) {
            System.out.println("Name nicht gefunden.");
        }

    }




}
