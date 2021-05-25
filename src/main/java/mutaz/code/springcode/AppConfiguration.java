package mutaz.code.springcode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    // the name of the bean will be based on the method name
    // you can change this by using @Bean(name="sq")
    @Bean
    public SequenceGenerator sequenceGenerator(){
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        sequenceGenerator.setPrefix("30");
        sequenceGenerator.setSuffix("A");
        sequenceGenerator.setInitial(100);
        return sequenceGenerator;
    }
}
