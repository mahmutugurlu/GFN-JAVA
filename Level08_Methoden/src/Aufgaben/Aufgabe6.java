package Aufgaben;

public class Aufgabe6 {

    public static void main(String[] args) {

        String text = "Programmierung";
        char buchstabe=' ';

        System.out.println(anzahlBuchstaben("ahmet",'a'));

    }

    //Aufgabe 6: Buchstaben zaehlen

    static int anzahlBuchstaben (String text, char buchstabe){

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i)==buchstabe){
                count++;
            }

        }

        return count;
    }
}
