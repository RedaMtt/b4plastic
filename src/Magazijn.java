import java.sql.Date;
import java.util.List;

public class Magazijn {
    private int id;
    private String Straat;
    private String Straatnr;
    private int postcode;
    private boolean niveauIsHoog;
    private double capaciteit;
    private Magazijnier verantwoordelijke;

    private List<PlasticItem> plasticItem;

    public Magazijn(int id, String straat, String straatnr, int postcode, boolean niveauIsHoog, double capaciteit, Magazijnier verantwoordelijke) {
        this.id = id;
        Straat = straat;
        Straatnr = straatnr;
        this.postcode = postcode;
        this.niveauIsHoog = niveauIsHoog;
        this.capaciteit = capaciteit;
        this.verantwoordelijke = verantwoordelijke;
    }

    public void updateStockageNiveau (){}
    public void getStockageNiveau (){}
    public void magazijnUpdate (){}
    public void magazijnVullen (){}
    public void magazijnControleren (){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStraat() {
        return Straat;
    }

    public void setStraat(String straat) {
        Straat = straat;
    }

    public String getStraatnr() {
        return Straatnr;
    }

    public void setStraatnr(String straatnr) {
        Straatnr = straatnr;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public boolean isNiveauIsHoog() {
        return niveauIsHoog;
    }

    public void setNiveauIsHoog(boolean niveauIsHoog) {
        this.niveauIsHoog = niveauIsHoog;
    }

    public double getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(double capaciteit) {
        this.capaciteit = capaciteit;
    }

    public Magazijnier getVerantwoordelijke() {
        return verantwoordelijke;
    }

    public void setVerantwoordelijke(Magazijnier verantwoordelijke) {
        this.verantwoordelijke = verantwoordelijke;
    }

}

