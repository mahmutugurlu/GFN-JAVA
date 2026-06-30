package Aufgaben;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int benutzerVersucht = 0;

// 1. wörter bekommen
        String wort = frageWörter();

// 2. macht char
        char[] harfler = buchstaben(wort);

        while (true) {

            System.out.print("Bitte geben Sie ein Buchstaben ein: ");
            char a = BenutzerVermutung(scanner);

            boolean richtig = false;

            for (int i = 0; i < harfler.length; i++) {
                if (harfler[i] == a) {
                    richtig = true;
                }
            }

            if (richtig) {
                System.out.println("Richtig!");
            } else {
                System.out.println(" Falsch!");
                benutzerVersucht++;

                hangman(benutzerVersucht);
            }


            if (benutzerVersucht == 7) {
                System.out.println("Richtige Antwort :" + frageWörter());
                System.out.println("Game Over!");

                break;
            }


        }

    }

        public static String frageWörter () {

            String[] words = {
                    "java", "class", "object", "method", "variable",
                    "array", "loop", "if", "else", "switch",
                    "case", "break", "continue", "while", "for",
                    "do", "string", "int", "double", "boolean",
                    "true", "false", "scanner", "input", "output",
                    "system", "print", "println", "random", "math",
                    "abs", "max", "min", "file", "path",
                    "read", "write", "open", "close", "buffer",
                    "stream", "exception", "try", "catch", "finally",
                    "error", "debug", "compile", "run", "code",
                    "software", "hardware", "network", "server", "client",
                    "protocol", "tcp", "ip", "http", "https",
                    "cloud", "database", "sql", "table", "row",
                    "column", "insert", "update", "delete", "select",
                    "index", "key", "primary", "foreign", "join",
                    "inner", "left", "right", "full", "group",
                    "order", "by", "having", "user", "admin",
                    "login", "password", "security", "encrypt", "decrypt"};


            Random random = new Random();

            int index = random.nextInt(words.length);

            String frageWord = words[index];

            for (int i = 0; i < frageWord.length(); i++) {

                System.out.print(" _ ");

            }
            System.out.println();


            return frageWord;
        }

        public static char BenutzerVermutung (Scanner scanner){
            String vermutung = scanner.next();
            char a = vermutung.charAt(0);
            return a;
        }


    public static void hangman(int falsch) {

        ArrayList<String> spiel = new ArrayList<>();

        spiel.add(" +---+");

        spiel.add("     |");
        spiel.add("     |");
        spiel.add("     |");
        spiel.add("     |");
        spiel.add("     |");
        spiel.add("========");

        // ✅ sıralı adam çizimi

        if (falsch>=1){
            spiel.set(1, " |   |");
        }
        if (falsch >= 2) {
            spiel.set(2, " O   |");      // kopf
        }
        if (falsch >= 3) {
            spiel.set(3, " |   |");      // körper
        }
        if (falsch >= 4) {
            spiel.set(3, "/|   |");      // left arm
        }
        if (falsch >= 5) {
            spiel.set(3, "/|\\  |");     // recht armm
        }
        if (falsch >= 6) {
            spiel.set(4, "/    |");      // left bein
        }
        if (falsch >= 7) {
            spiel.set(4, "/ \\  |");     //recht beni
        }

        for (int i = 0; i < spiel.size(); i++) {
            System.out.println(spiel.get(i));
        }
    }


        static char[] buchstaben (String wort){

            char[] harfler = new char[wort.length()];

            for (int i = 0; i < wort.length(); i++) {
                harfler[i] = wort.charAt(i);
            }

            return harfler;
        }



}







