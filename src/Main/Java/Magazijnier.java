package Main.Java;

import java.sql.Date;

public class Magazijnier extends Persoon implements IMagazijnier {
    private String role;
    private Date shift;
    public Magazijnier(int id, String role, Date shift) {
        this.role = role;
        this.shift = shift;
    }

    public Magazijnier(int id, String voornaam, String achternaam, String email, String password, String gsm, String role, Date shift) {
        super(id, voornaam, achternaam, email, password, gsm);
        this.role = role;
        this.shift = shift;
    }

    public Magazijnier(String role, Date shift) {
        this.role = role;
        this.shift = shift;
    }

    @Override
    public void aanvullenVoorraad() {
        // aanvullen voorraad logica
    }
    @Override
    public void ontvangRapport() {
        // ontvang rapport logica
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public Date getShift() {
        return shift;
    }
    public void setShift(Date shift) {
        this.shift = shift;
    }
}