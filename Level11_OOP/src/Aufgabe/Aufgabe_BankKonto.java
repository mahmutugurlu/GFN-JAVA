package Aufgabe;

import java.util.Scanner;

public class Aufgabe_BankKonto {



    private String vorname;
    private String nachname;
    private String kontonummer;
    private double kontostand;
    private double überziehungslimit;
    public Scanner scanner;


    public Aufgabe_BankKonto(String vorname, String nachname, String kontonummer, double kontostand, double überziehungslimit) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
        this.überziehungslimit = überziehungslimit;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public double getÜberziehungslimit() {


        return überziehungslimit;
    }

    public void setÜberziehungslimit(double überziehungslimit) {
        this.überziehungslimit = überziehungslimit;
    }

    @Override
    public String toString() {
        return "Aufgabe_BankKonto{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", kontonummer='" + kontonummer + '\'' +
                ", kontostand= " + kontostand +
                ", überziehungslimit=" + überziehungslimit +
                '}';
    }




    public Aufgabe_BankKonto(Scanner scanner) {

        this.scanner = scanner;
    }



     int auswähl(Scanner scanner){

        System.out.println(" Für Einzahlung drucken Sie 1, Für Auszahlung 2, Für Beendung 3");

        int auswählZahl = scanner.nextInt();
        return auswählZahl;
    }




    public double einzahlen(Scanner scanner) {

        System.out.println("Bitte geben Sie den Einzahlungsbetrag ein.");

        double betrag = scanner.nextDouble();

        if (betrag <= 0) {
            System.out.println("Fehler!");
        } else {
            kontostand += betrag;
            System.out.println("Einzahlung: " + betrag + " EUR erfolgreich.");
        }
        return kontostand;
    }


    double auszahlen (Scanner scanner){

        System.out.println("Bitte geben Sie den Auszahlungsbetrag ein.");

        double betrag = scanner.nextDouble();

        if (betrag >kontostand+500) {
            System.out.println("Auszahlung: " + betrag + " EUR nicht moeglich -- Ueberziehungslimit wuerde ueberschritten. ");
        } else {
            kontostand -= betrag;
            System.out.println("Auszahlung: " + betrag + " EUR erfolgreich.");
        }
        return kontostand;
    }
}
