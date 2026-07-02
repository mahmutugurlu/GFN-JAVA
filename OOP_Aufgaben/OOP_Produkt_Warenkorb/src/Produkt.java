public class Produkt {



    private String warenName;

    private double warenPries;

    private int anzahl;

    public Produkt(String warenName, double warenPries, int anzahl) {
        this.warenName = warenName;
        this.warenPries = warenPries;
        this.anzahl = anzahl;
    }

    public String getWarenName() {
        return warenName;
    }

    public void setWarenName(String warenName) {
        this.warenName = warenName;
    }

    public double getWarenPries() {
        return warenPries;
    }

    public void setWarenPries(double warenPries) {

        this.warenPries = warenPries;


    }

    public int getAnzahl() {

        if(anzahl == 0){
            System.out.println("Fehler: Anzahl kann nicht unter 0 fallen. Wert bleibt unveraendert");
        }
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "warenName='" + warenName + '\'' +
                ", warenPries=" + warenPries +
                ", anzahl=" + anzahl +
                '}';
    }



    public void erhoeheAnzahl(int menge){

        anzahl += menge;
    }


   public void verringereAnzahl(int menge){

        anzahl-=menge;
   }


}
