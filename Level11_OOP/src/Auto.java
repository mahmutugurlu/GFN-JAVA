public class Auto {

    // ======= Attribute (Eigenschaften) =========
    // Diese Variablen beschreiben den Zustand eines Objektes

    private String marke;
    private String modell;
    private int baujahr;
    private String farbe;
    private int geschwindigkeit;

    // ======= Konstruktor =======
    /*
     * Ein Konstruktor ist eine spezielle Methode, die beim Erzeugen eines Objekts
     * mit "new" aufgerufen wird. Er hat keinen Rückgabewert und heißt wie die Klasse.
     * 'this' referenziert die aktuelle Instanz (das gerade erstellte Objekt).
     */

    // Standardkonstruktor (Redundant)
    public Auto(){

    }

    // Überladener Konstruktor
    public Auto(String marke, String modell, int baujahr, String farbe){
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.farbe = farbe;
        //Standardwert setzen
        this.geschwindigkeit = 0;
    }


    // Konstruktor ruft anderen Konstruktor auf
    public Auto(String marke, String modell, int baujahr){
        // Anderen Konstruktor aufrufen
        this(marke, modell, baujahr, "unbekannt");
    }


    // Getter
    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    // Setter
    public void setFarbe(String farbe){
        if(!farbe.equals("weiß")){
            this.farbe = farbe;
        } else {
            System.out.println("Autos dürfen nicht weiß lackiert werden!");
        }
    }

    // Methoden
    public void beschleunigen(int wert){
        geschwindigkeit += wert;
        System.out.println(marke + " " + modell + " beschleunigt auf " + geschwindigkeit + "km/h");
    }

    public void bremsen(int wert){
        geschwindigkeit -= wert;
        if (geschwindigkeit < 0){
            geschwindigkeit = 0;
        }
        System.out.println(marke + " " + modell + " bremst auf " + geschwindigkeit + "km/h runter");
    }

    // Lesbare Ausgabe eines Objektes

    @Override
    public String toString() {
        return "Auto{" +
                "marke='" + marke + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                ", farbe='" + farbe + '\'' +
                ", geschwindigkeit=" + geschwindigkeit +
                '}';
    }
}
