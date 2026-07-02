import Aufgabe_Rechteck.Rechteck;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Rechteck berechnung = new Rechteck();


        //System.out.println(berechnung);


        while (true) {


            int auswähl = berechnung.auswähl(scanner);


// --**
            if (auswähl == 1) {

                System.out.println(berechnung.berechneFlaeche(scanner));
            } else if (auswähl == 2) {

                System.out.println(berechnung.berechneUmfang(scanner));

            } else if (auswähl == 3) {
                berechnung.skalierung(scanner);


            } else if (auswähl==4) {

                System.out.println("beendet");
                break;

            }


        }

    }
}