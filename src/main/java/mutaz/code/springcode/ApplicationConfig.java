package mutaz.code.springcode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Product A(){
        return new Product("A");
    }
    @Bean
    public Product B(){
        return new Product("B");
    }
    @Bean
    public Product C(){
        return new Product("C");
    }
}
