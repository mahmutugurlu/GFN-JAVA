public class SmartKlimageraet
        implements Schaltbar, Temparierbar {

    private String name;

    public SmartKlimageraet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void schalteAn() {
        System.out.println(name + " eingeschaltet");
    }

    @Override
    public void schalteAus() {
        System.out.println(name + " ausgeschaltet");
    }

    @Override
    public void setzeTemperatur(int t) {
        System.out.println(name + " Temperatur auf " + t + "°C gesetzt");
    }
}
