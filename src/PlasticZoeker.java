import java.util.Date;
import java.util.List;

public class PlasticZoeker extends Persoon{
    private Date Shift;

    private Scheepslading scheepslading;

    public PlasticZoeker(int id, String voornaam, String achternaam, String email, String password, String gsm, Date shift) {
        super(id, voornaam, achternaam, email, password, gsm);
        Shift = shift;
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
