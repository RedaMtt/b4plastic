import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Component
public class Kapitein extends Persoon{
    private Date shift;
    private List<Route> routes;
    public Kapitein(Date shift) {
        this.shift = shift;
    }

    public Kapitein(int id, String voornaam, String achternaam, String email, String password, String gsm) {
        super(id, voornaam, achternaam, email, password, gsm);
    }

    public Kapitein() {

    }

    public void vindRoute(){}
    public void vraagVoorAlternatieveRoute(){}
    public Date getShift() {
        return shift;
    }
    public void setShift(Date shift) {
        this.shift = shift;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
}