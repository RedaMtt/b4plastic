import java.awt.*;
import java.sql.Date;
import java.util.List;

public class Scheepslading {
    private int id;
    private double gewicht;
    private Date ladingdatum;
    private Kapitein ladingverantwoordelijke;
    private boolean isVol;
    private List<PlasticItem> plasticitems;
    private Route route;

    public Scheepslading(int id, double gewicht, Date ladingdatum, Kapitein ladingverantwoordelijke, boolean isVol, List<PlasticItem> plasticitems) {
        this.id = id;
        this.gewicht = gewicht;
        this.ladingdatum = ladingdatum;
        this.ladingverantwoordelijke = ladingverantwoordelijke;
        this.isVol = isVol;
        this.plasticitems = plasticitems;
    }

    public void getCompositie(){}
    public void vullen(){}
    public void aanpassen(){}
    public void controleren(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public Date getLadingdatum() {
        return ladingdatum;
    }

    public void setLadingdatum(Date ladingdatum) {
        this.ladingdatum = ladingdatum;
    }

    public Kapitein getLadingverantwoordelijke() {
        return ladingverantwoordelijke;
    }

    public void setLadingverantwoordelijke(Kapitein ladingverantwoordelijke) {
        this.ladingverantwoordelijke = ladingverantwoordelijke;
    }

    public boolean isVol() {
        return isVol;
    }

    public void setVol(boolean vol) {
        isVol = vol;
    }

    public List<PlasticItem> getPlasticitems() {
        return plasticitems;
    }

    public void setPlasticitems(List<PlasticItem> plasticitems) {
        this.plasticitems = plasticitems;
    }
}
