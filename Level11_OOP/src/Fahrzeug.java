public class Fahrzeug {

    private String marke;
    private String modell;
    private int baujahr;
    private String farbe;
    private int geschwindigkeit;


    public Fahrzeug(String marke, String modell, int baujahr, String farbe, int geschwindigkeit) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.farbe = farbe;
        this.geschwindigkeit = geschwindigkeit;
    }

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

    public void setFarbe(String farbe) {
        if (!farbe.equals("weiß")){
            this.farbe = farbe;
        }
    }


    @Override
    public String toString() {
        return "Fahrzeug{" +
                "marke='" + marke + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                ", farbe='" + farbe + '\'' +
                ", geschwindigkeit=" + geschwindigkeit +
                '}';
    }
}
