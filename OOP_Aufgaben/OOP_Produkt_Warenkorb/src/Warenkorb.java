import java.util.ArrayList;

public class Warenkorb extends Produkt{

ArrayList<Produkt> waren = new ArrayList<>();

    public Warenkorb(String warenName, double warenPries, int anzahl) {
        super(warenName, warenPries, anzahl);
    }

    public ArrayList<Produkt> getWaren() {
        return waren;
    }


   public void addProdukt(Produkt produkt){
       waren.add(produkt);

   }

    public double berechneGesamtpreis(){


        double gesamt = 0;

        for (Produkt p : waren) {
            gesamt += p.getWarenPries() * p.getAnzahl();
        }

        return gesamt;

    }


    public void printWarenkorb(){



        System.out.println("=== Warenkorb ===");

        for (Produkt p : waren) {
            System.out.println(p);
        }

        System.out.println("-------------------");
        System.out.println("Gesamt: " + berechneGesamtpreis() + " EUR");
    }

}



