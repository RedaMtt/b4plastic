import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlasticItem {
    @Autowired
    private PlasticType plasticType;
    private double gewicht;
    private boolean recycleerbaar;
    public PlasticItem(PlasticType plasticType, double gewicht, boolean recycleerbaar) {
        this.plasticType = plasticType;
        this.gewicht = gewicht;
        this.recycleerbaar = recycleerbaar;
    }
    public double getGewicht() {
        return gewicht;
    }
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    public boolean isRecycleerbaar() {
        return recycleerbaar;
    }
    public void setRecycleerbaar(boolean recycleerbaar) {
        this.recycleerbaar = recycleerbaar;
    }
    public PlasticType getPlasticType() {
        return plasticType;
    }
    public void setPlasticType(PlasticType plasticType) {
        this.plasticType = plasticType;
    }
}