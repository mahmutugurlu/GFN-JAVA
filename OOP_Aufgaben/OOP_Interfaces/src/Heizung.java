public class Heizung implements Temparierbar{

    private String name;

    public Heizung(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setzeTemperatur(int t) {

    }
}
