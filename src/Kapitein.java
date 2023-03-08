import java.sql.Date;
import java.util.List;
public class Kapitein extends Persoon{
    private Date shift;
    private List<Route> routes;
    public Kapitein(Date shift) {
        this.shift = shift;
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

