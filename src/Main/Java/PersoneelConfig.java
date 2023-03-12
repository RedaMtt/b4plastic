import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
//@EnableAsync
//@EnableMBeanExport
public class PersoneelConfig {

    @Bean
    public List<Persoon> personen() {
        List<Persoon> personen = new ArrayList<>();
        personen.add(new Kapitein(1, "John", "Doe", "johndoe@gmail.com", "qwerty12", "12345678"));
        personen.add(new Magazijnier(2, "Jane", "Doe", "janedoe@gmail.com", "qwerty12", "23456789"));
        personen.add(new PlasticZoeker(3, "Alice", "Smith", "alicesmith@gmail.com", "qwerty12", "34567890"));
        personen.add(new Onderzoeker(4, "Bob", "Johnson", "bobjohnson@gmail.com", "qwerty12", "45678901"));
        return personen;
    }

}