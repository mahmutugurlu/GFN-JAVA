package Aufgaben;

import java.util.Scanner;

public class Aufgabe7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        double balance = 155000.0;

        while(true) {

        System.out.println(" # # # # # # # # # #\n" +
                "# BANK AUTOMAT #\n" +
                "# # # # # # # # # #\n" +
                "1. Kontostand anzeigen\n" +
                "2. Einzahlung\n" +
                "3. Auszahlung\n" +
                "4. Beenden\n" +
                "Was moechten Sie tun?: " );


            int zahl = scanner.nextInt();






         if (zahl == 1) {

             System.out.println("Hier ist ihr aktueller Kontostand:");
             System.out.println("# # # # # # # # # #");
             System.out.println("# " + showBalance(balance) + " €    #");
             System.out.println("# # # # # # # # # #");

         }

         if (zahl == 2) {
             //System.out.println("Bitte geben Sie den Einzahlungsbetrag ein.");
            balance =  deposit(scanner,balance);
             //double depositsGeld = scanner.nextDouble();
             /*System.out.println("Hier ist ihr aktueller Kontostand:");
             System.out.println("# # # # # # # # # #");
             System.out.println("# " + deposit(scanner1, balance) + " €    #");
             System.out.println("# # # # # # # # # #");
                            */
         }

         if (zahl == 3) {
             //System.out.println("Bitte geben Sie den Auszahlungsbetrag ein.");

             balance = withdraw(scanner,balance);
           /*
             System.out.println("Hier ist ihr aktueller Kontostand:");
             System.out.println("# # # # # # # # # #");
             System.out.println("# " + withdraw(withdrwasGeld, balance) + " €    #");
             System.out.println("# # # # # # # # # #");

            */
         }

         if (zahl ==4) {

             System.out.println("Beendet");

             break;
         }


     }

    }

    //Bankautomat

    static double showBalance(double balance){


        return balance;
    }


   static double deposit(Scanner scanner,double balance){

       System.out.println("Bitte geben Sie den Einzahlungsbetrag ein.");

       double depositsGeld = scanner.nextDouble();

       double neuBalance=  depositsGeld+balance;

       balance = neuBalance;



        return balance;
   }


   static double withdraw (Scanner scanner, double balance){

       System.out.println("Bitte geben Sie den Auszahlungsbetrag ein.");
       double withdrwasGeld = scanner.nextDouble();

       double neuKontostand1 = balance-withdrwasGeld;
       balance = neuKontostand1;

       return balance;
   }


}
