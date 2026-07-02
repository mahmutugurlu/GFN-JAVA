import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Runner {
    public static void main(String[] args) {

        Produkt apfel = new Produkt("Apfel",0.99,0);

        Produkt brot = new Produkt("brot",1.49, 0);

        Produkt milch = new Produkt("Milch", 0.89, 0);

        Warenkorb korb = new Warenkorb(apfel.getWarenName(), apfel.getWarenPries(), apfel.getAnzahl());

        korb.addProdukt(apfel);
        korb.addProdukt(brot);
        korb.addProdukt(milch);

        korb.printWarenkorb();

        apfel.erhoeheAnzahl(0);

        System.out.println("Nach Aenderung (Apfel +2):");

        korb.printWarenkorb();




    }
}