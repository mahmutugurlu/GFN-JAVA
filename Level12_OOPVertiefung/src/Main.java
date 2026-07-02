import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

 import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {

            // Vererbung und Polymorphismus
            // Wir speichern Objekte der Subklassen in Variablen vom Typ der Superklasse
            // Das nennt man Polymorphismus: Ein Objekt kann viele "Gestalten" haben

            Fahrzeug f1 = new Auto(4, "VW", 2015);
            Fahrzeug f2 = new Motorrad(false, "Harley", 2020);
            // Das geht auch, Objekte der Oberklassen erstellen
            Fahrzeug f3 = new Fahrzeug("Volvo", 1992);

            // Polymorphismus
            // Obwohl f1 und f2 vom Typ Fahrzeug sind wird zur Laufzeit
            // die passende starte() Methode der Subklasse aufgerufen
            f1.starten();
            f2.starten();
            f3.starten();

            // toString wurde in den Subklassen überschrieben
            System.out.println(f1.toString());
            System.out.println(f2.toString());
            System.out.println(f3.toString());

            // Abstrakte Klassen
            Tier hund = new Hund("Bello");
            Tier katze = new Katze("Minka");

            // Geht nicht, da Tier abstrakt ist (kann keine Objekte dieser Klasse erstellen)
            // Tier tier = new Tier("Hans Peter");

            // Abstrakte Methoden
            hund.geraeuschMachen();
            katze.geraeuschMachen();

            // Interfaces
            Fliegen airbus = new Flugzeug("Airbus", 2012, 220);
            Fliegen vogel = new Wellensittich("Robin", "gelb");

            // Auch Polymorphismus
            airbus.fliegen(1000);
            vogel.fliegen(500);

            ArrayList<Fliegen> fliegendeSachen = new ArrayList<>();

            fliegendeSachen.add(airbus);
            fliegendeSachen.add(vogel);

            System.out.println("_______________");

            for(Fliegen flugDings : fliegendeSachen){
                flugDings.fliegen(1500);
            }

            airbus.stoppen();
            vogel.stoppen();
        }
    }

