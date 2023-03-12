import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class PlasticZoeker extends Persoon{
    private Date Shift;
    private Scheepslading scheepslading;
    public PlasticZoeker(int id, String voornaam, String achternaam, String email, String password, String gsm) {
        super(id, voornaam, achternaam, email, password, gsm);
    }

    public PlasticZoeker() {

    }

    public void beoordeelScheepslading(){

    }
    public Date getShift() {
        return Shift;
    }
    public void setShift(Date shift) {
        Shift = shift;
    }
}