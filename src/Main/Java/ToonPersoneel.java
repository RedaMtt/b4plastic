import java.util.ArrayList;

class PersoneelsLijst {
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

public class ToonPersoneel {

    public static void main(String[] args){
        PersoneelsLijst persoonsLijst = new PersoneelsLijst();

        Persoon p1 = new Kapitein();
        Persoon p2 = new Magazijnier();
        Persoon p3 = new Magazijnier();
        Persoon p4 = new Onderzoeker();
        Persoon p5 = new PlasticZoeker();

        persoonsLijst.addToPersoonssLijst(p1);
        persoonsLijst.addToPersoonssLijst(p2);
        persoonsLijst.addToPersoonssLijst(p3);
        persoonsLijst.addToPersoonssLijst(p4);
        persoonsLijst.addToPersoonssLijst(p5);

        for (Persoon persoon : persoonsLijst.getPersoonsLijst()) {
            System.out.println(persoon.getClass().getSimpleName());
        }
    }
}