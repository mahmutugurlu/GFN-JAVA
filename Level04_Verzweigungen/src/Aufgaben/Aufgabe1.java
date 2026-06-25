package Aufgaben;

import java.util.Scanner;

import static java.lang.System.in;

public class Aufgabe1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Bitte gib dein Alter ein: ");

        int alter = scanner.nextInt();

        if (alter<18){
            System.out.println(" Du bist minderjaehrig. ");
        } else if (18>=alter&& alter<=64) {

            System.out.println(" Du bist volljaehrig. ");

        } else {

            System.out.println(" Du bist Rentner. ");

        }

    }
}
