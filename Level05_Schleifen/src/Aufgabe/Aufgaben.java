package Aufgabe;

import java.util.Scanner;

public class Aufgaben {

    public static void main(String[] args) {

       // Aufgabe 1: Summieren mit for

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Bitte geben Sie ein Zahl ein");

        int j = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <=j ; i++) {

            sum = sum+i;

            //continue;



        }
        System.out.println(sum);

    }
}
