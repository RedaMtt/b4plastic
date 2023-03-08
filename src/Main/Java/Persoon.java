package Main.Java;

public abstract class Persoon {
    private int id;
    private String voornaam;
    private String achternaam;
    private String email;
    private String password;
    private String gsm;
    public Persoon(int id, String voornaam, String achternaam, String email, String password, String gsm) {
        this.id = id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
        this.password = password;
        this.gsm = gsm;
    }
    public Persoon() {}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getVoornaam() {
        return voornaam;
    }
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
    public String getAchternaam() {
        return achternaam;
    }
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getGsm() {
        return gsm;
    }
    public void setGsm(String gsm) {
        this.gsm = gsm;
    }
}