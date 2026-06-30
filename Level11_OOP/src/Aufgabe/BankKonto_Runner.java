package Aufgabe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BankKonto_Runner  {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Aufgabe_BankKonto konto = new Aufgabe_BankKonto(
                "Max\n", "Mustermann\n", "DE123456789\n", 750.00 , -500.00
        );


        System.out.println(konto);





      while (true){




// seçim
          int auswähl = konto.auswähl(scanner);

// işlem
          if (auswähl == 1) {
              double neuKontoStand = konto.einzahlen(scanner);
              konto.setKontostand(neuKontoStand);
              System.out.println("Kontostand: " + konto.getKontostand());
          }
          else if (auswähl == 2) {
              double nueKontoStand = konto.auszahlen(scanner);
              konto.setKontostand(nueKontoStand);
              System.out.println("Kontostand: " + konto.getKontostand());

          } else if (auswähl==3) {
              System.out.println("Beendet");
              break;

          }







      }







    }
}
