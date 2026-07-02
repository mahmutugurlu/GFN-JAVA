package Aufgabe_Rechteck;

import java.util.Scanner;

public class Rechteck {

    private double breite;
    private double höhe;
    private double flaeche;
    private double umfang;
    private double skal;
    private Scanner scanner;

    public Rechteck(Scanner scanner) {
        this.scanner = scanner;
    }

    public Rechteck() {
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return höhe;
    }

    public void setHoehe(double höhe) {
        this.höhe = höhe;
    }


    public int auswähl(Scanner scanner){

        System.out.println(" Für Flächenberechnung drucken Sie 1, Für Umfangsberechnung 2, Für Skalierung   3, für Beendung 4");

        int auswählZahl = scanner.nextInt();
        return auswählZahl;
    }




    public double berechneFlaeche(Scanner scanner) {

        System.out.println("Bitte geben Sie den Wert von Breite ein.");
        double flaeche= 1;
        double breite = scanner.nextDouble();

        System.out.println("Bitte geben Sie den Wert von Höhe ein.");

        double höhe = scanner.nextDouble();

        if (breite < 0 && höhe<0) {
            System.out.println("Fehler: Breite muss groesser als 0 sein. Wert wurde auf 1.0 gesetzt.");
        } else {
            flaeche = breite*höhe ;
            System.out.println(" Flaeche: " + flaeche) ;
        }
        return flaeche;
    }


    public double berechneUmfang (Scanner scanner){
        double umfang= 0;
        System.out.println("Bitte geben Sie den Wert von Breite ein.");

        double breite = scanner.nextDouble();

        System.out.println("Bitte geben Sie den Wert von Höhe ein.");

        double höhe = scanner.nextDouble();

        if (breite < 0 && höhe<0) {
            System.out.println("Fehler: Breite muss groesser als 0 sein. Wert wurde auf 1.0 gesetzt.");
        } else {
            umfang = (2*(breite+höhe)) ;
            System.out.println(" Flaeche: " + umfang) ;
        }
        return umfang;


    }


    public void skalierung(Scanner scanner) {


        System.out.println(" Bitte geben Sie für Skalierung ein Wert ein");

        double skal = scanner.nextDouble();

        System.out.println("Bitte geben Sie den Wert von Breite ein.");

        double breite = scanner.nextDouble();

        System.out.println("Bitte geben Sie den Wert von Höhe ein.");

        double höhe = scanner.nextDouble();

         double breite1 = breite * skal;
         double höhe1 = höhe* skal;
         flaeche = breite1*höhe1;
         umfang = 2*(breite1+höhe1);



        if (skal < 0) {
            System.out.println("Fehler: Skalierungsfaktor muss positiv sein. Masse unveraendert.");
        } else {
            System.out.println("Rechteck: " + breite1 + " * " + höhe1);
            System.out.println(" Flaeche: " +  flaeche);
            System.out.println(" Umfang: " + umfang);
        }


    }
}
