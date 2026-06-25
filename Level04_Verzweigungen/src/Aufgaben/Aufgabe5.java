package Aufgaben;

import java.util.Scanner;

public class Aufgabe5 {

    public static void main(String[] args) {


        //Kalt oder warm

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Wie viel Grad hat es heute? ");
        int zahl = scanner.nextInt();

      //  String wetterStand = (zahl < 10) ? " Es ist kalt draussen! " : " nicht kalt...";
      //  System.out.println(wetterStand );

        String wetterStand= "Es ist kalt draussen! ";
        boolean istCold = (zahl<10)? true:false;

        if (istCold==true){
            System.out.println("Es ist kalt draussen!");
        }
        else {
            System.out.println("nicht kalt!");
        }




    }
}
