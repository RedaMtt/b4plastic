import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class PersoneelConfig {

    @Bean
    public IPersoneelsLijst personeelsLijst() {
        return new PersoneelsLijst();
    }

    @Bean
    public ToonPersoneel toonPersoneel(IPersoneelsLijst personeelsLijst) {
        return new ToonPersoneel(personeelsLijst);
    }

}