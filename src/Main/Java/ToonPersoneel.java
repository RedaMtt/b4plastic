import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class ToonPersoneel {
    private IPersoneelsLijst personeelsLijst;
    public ToonPersoneel(IPersoneelsLijst personeelsLijst) {
        this.personeelsLijst = personeelsLijst;
    }
    public void toonPersoneel() {
        Persoon p1 = new Kapitein();
        Persoon p2 = new Magazijnier();
        Persoon p3 = new Magazijnier();
        Persoon p4 = new Onderzoeker();
        Persoon p5 = new PlasticZoeker();
        this.personeelsLijst.addToPersoonssLijst(p1);
        this.personeelsLijst.addToPersoonssLijst(p2);
        this.personeelsLijst.addToPersoonssLijst(p3);
        this.personeelsLijst.addToPersoonssLijst(p4);
        this.personeelsLijst.addToPersoonssLijst(p5);
        for (Persoon persoon : this.personeelsLijst.getPersoonsLijst()) {
            System.out.println(persoon.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersoneelConfig.class);
        IPersoneelsLijst personeelsLijst = context.getBean(IPersoneelsLijst.class);
        ToonPersoneel toonPersoneel = new ToonPersoneel(personeelsLijst);
        toonPersoneel.toonPersoneel();
    }
}





