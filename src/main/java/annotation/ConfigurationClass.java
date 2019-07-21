package annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

    @Bean
    public PersonBean personBean() {
        return new PersonBean();
    }
}
