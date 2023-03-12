import org.springframework.stereotype.Component;

public abstract class Persoon implements IPersoon {
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
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String getVoornaam() {
        return voornaam;
    }
    @Override
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
    @Override
    public String getAchternaam() {
        return achternaam;
    }
    @Override
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String getGsm() {
        return gsm;
    }
    @Override
    public void setGsm(String gsm) {
        this.gsm = gsm;
    }
}