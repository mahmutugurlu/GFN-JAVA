//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Ein Objekt der Klasse Auto erzeugen
//        Auto auto = new Auto();

//        auto.marke = "VW";
//        auto.modell = "Golf";
//        auto.baujahr = 2010;
//        auto.farbe = "Rot";
//        auto.geschwindigkeit = 0;
//
//        System.out.println(auto.marke);
//        System.out.println(auto.modell);

        Auto auto = new Auto("VW", "Golf", 2010, "Rot");

//        System.out.println(auto.marke);
//        System.out.println(auto.modell);

        Auto auto2 = new Auto("Mercedes", "E", 2026);

        // 1 Option
        Auto fahrzeug = new Auto();
        // 2 Option
        Auto fahrzeug2 = new Auto("Volvo", "V70", 1995);
        // 3 Option
        Auto fahrzeug3 = new Auto("BMW", "E30", 1992, "Schwarz");

//        System.out.println(fahrzeug3.marke);
//        fahrzeug3.marke = "Kia";
//        System.out.println(fahrzeug3.marke);

        System.out.println(fahrzeug3.getMarke());

        Auto fahrzeug4 = new Auto(fahrzeug3.getMarke(), fahrzeug3.getModell(), fahrzeug3.getBaujahr(), fahrzeug3.getFarbe());

//        System.out.println(fahrzeug3.farbe);
//        fahrzeug3.farbe = "weiß";
//        System.out.println(fahrzeug3.farbe);

        System.out.println(fahrzeug3.getFarbe());
        fahrzeug3.setFarbe("blau");
        System.out.println(fahrzeug3.getFarbe());
        fahrzeug3.setFarbe("weiß");
        System.out.println(fahrzeug3.getFarbe());

        // Methoden eines Objektes anwenden
        System.out.println(fahrzeug3.getGeschwindigkeit());
        fahrzeug3.beschleunigen(30);
        System.out.println(fahrzeug3.getGeschwindigkeit());
        fahrzeug3.beschleunigen(20);
        System.out.println(fahrzeug3.getGeschwindigkeit());

        fahrzeug3.bremsen(25);
        System.out.println(fahrzeug3.getGeschwindigkeit());
        fahrzeug3.bremsen(100);
        System.out.println(fahrzeug3.getGeschwindigkeit());

//        System.out.println(fahrzeug3.getMarke());
//        System.out.println(fahrzeug3.getModell());
//        System.out.println(fahrzeug3.getBaujahr());
//        System.out.println(fahrzeug3.getFarbe());
//        System.out.println(fahrzeug3.getGeschwindigkeit());

        // Ausgabe des Objektes mit seinen Eigenschaften mithilfe von toString()
        System.out.println(fahrzeug3);

    }


}