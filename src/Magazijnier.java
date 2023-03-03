import java.sql.Date;

public class Magazijnier {
    private int id;
    private String role;
    private Date shift;

    public Magazijnier(int id, String role, Date shift) {
        this.id = id;
        this.role = role;
        this.shift = shift;
    }

    public void aanvullenVoorraad(){

    }

    public void ontvangRapport(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
