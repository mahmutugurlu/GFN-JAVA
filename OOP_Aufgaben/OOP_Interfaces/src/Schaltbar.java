import java.util.ArrayList;
import java.util.List;

public interface Schaltbar {

    public void schalteAn();


    public void schalteAus();

    List<Schaltbar> schaltbarGeraet = new ArrayList<>();


}
