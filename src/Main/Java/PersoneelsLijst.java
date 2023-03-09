import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PersoneelsLijst implements IPersoneelsLijst {
    private ArrayList<Persoon> personeelsLijst;
    public PersoneelsLijst() {
        this.personeelsLijst = new ArrayList<>();
    }
    public void addToPersoonssLijst(Persoon persoon) {
        this.personeelsLijst.add(persoon);
    }
    public ArrayList<Persoon> getPersoonsLijst() {
        return this.personeelsLijst;
    }
}
