import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


import java.util.List;

public class ToonPersoneel {
    private List<Persoon> personen;

    @Autowired
    public ToonPersoneel(List<Persoon> personen) {
        this.personen = personen;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}





