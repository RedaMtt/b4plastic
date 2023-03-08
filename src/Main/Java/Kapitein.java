import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Component
public class Kapitein extends Persoon{
    private Date shift;
    @Autowired
    private List<Route> routes;
    public Kapitein(Date shift) {
        this.shift = shift;
    }

    public Kapitein(int id, String voornaam, String achternaam, String email, String password, String gsm, Date shift, List<Route> routes) {
        super(id, voornaam, achternaam, email, password, gsm);
        this.shift = shift;
        this.routes = routes;
    }
    public void vindRoute(){}
    public void vraagVoorAlternatieveRoute(){}
    public Date getShift() {
        return shift;
    }
    public void setShift(Date shift) {
        this.shift = shift;
    }
}