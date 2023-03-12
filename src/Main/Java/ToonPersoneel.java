import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


import java.util.List;

public class ToonPersoneel {
    private static List<Persoon> personen;

    @Autowired
    public ToonPersoneel(List<Persoon> personen) {
        ToonPersoneel.personen = personen;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersoneelConfig.class);

        for (Persoon p: personen) {
            System.out.println(p.toString());
        }
    }
}





