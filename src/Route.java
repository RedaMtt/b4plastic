public class Route {
    private int id;
    private double longitude;
    private double latidtude;

    public Route(int id, double longitude, double latidtude) {
        this.id = id;
        this.longitude = longitude;
        this.latidtude = latidtude;
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
}
