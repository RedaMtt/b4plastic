import java.sql.Date;

public class Kapitein extends Persoon{
    private Date shift;

    public Kapitein(Date shift) {
        this.shift = shift;
    }

    public void vindRoute(){

    }

    public void vraagVoorAlternatieveRoute(){

    }

    public Date getShift() {
        return shift;
    }

    public void setShift(Date shift) {
        this.shift = shift;
    }
}

