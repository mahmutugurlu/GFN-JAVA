public class Lampe implements Schaltbar{

    private String name;

    public Lampe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void schalteAn() {

    }

    @Override
    public void schalteAus() {

    }
}
