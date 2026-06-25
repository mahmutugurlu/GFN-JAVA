package Aufgabe;

import java.util.Scanner;

public class Aufgabe2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Bitte geben Sie ein Zahl ein");

        int j = scanner.nextInt();

        int x = 1;

        for (int i = 1; i <=10 ; i++) {

            x = j *i;

            System.out.println(x);

        }
    }
}
