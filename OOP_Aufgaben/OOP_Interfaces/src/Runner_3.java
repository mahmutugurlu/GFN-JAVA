import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Runner_3 {
   import java.util.ArrayList;
import java.util.List;

    public class Main {

        public static <Temperierbar> void main(String[] args) {

            Lampe lampe =
                    new Lampe("Schreibtischlampe");

            Heizung heizung =
                    new Heizung("Heizung Schlafzimmer");

            SmartKlimageraet klima =
                    new SmartKlimageraet("Klimagerät Wohnzimmer");



            List<Schaltbar> schaltbareGeraete =
                    new ArrayList<>();

            schaltbareGeraete.add(lampe);
            schaltbareGeraete.add(klima);



            List<Temperierbar> temperierbareGeraete =
                    new ArrayList<>();

            temperierbareGeraete.add((Temperierbar) heizung);
            temperierbareGeraete.add((Temperierbar) klima);



            for (Schaltbar s : schaltbareGeraete) {

                s.schalteAn();
                s.schalteAus();
            }

            for (Temperierbar t : temperierbareGeraete) {

                t.setzeTemperatur(22);
            }
        }
    }
}