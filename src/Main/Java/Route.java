import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Route {
    private int id;
    private double longitude;
    private double latidtude;
    private Locatie locatie;
    public Route(int id, double longitude, double latidtude, Locatie locatie) {
        this.id = id;
        this.longitude = longitude;
        this.latidtude = latidtude;
        this.locatie = locatie;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public double getLatidtude() {
        return latidtude;
    }
    public void setLatidtude(double latidtude) {
        this.latidtude = latidtude;
    }
    public Locatie getLocatie() {
        return locatie;
    }
    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }
}