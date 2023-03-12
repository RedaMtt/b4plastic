import org.springframework.stereotype.*;

import java.sql.Date;
@Component
public class Magazijnier extends Persoon {
    private String role;
    private Date shift;

    public Magazijnier(int id, String voornaam, String achternaam, String email, String password, String gsm) {
        super(id, voornaam, achternaam, email, password, gsm);
    }

    public Magazijnier() {
    }

    public void aanvullenVoorraad() {
        // aanvullen voorraad logica
    }
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