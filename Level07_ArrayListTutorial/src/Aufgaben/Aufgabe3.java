package Aufgaben;

import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        while (true) {

            System.out.println("Gib einen Namen ein (stop zum Beenden): ");

            String name = scanner.next();

            if (name.equalsIgnoreCase("stop")) {
                break;
            }

            names.add(name);

            System.out.println(names);
        }

    }
}
