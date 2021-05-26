package mutaz.code.springcode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// if you have multiple java configuration and you need to inject beans from different locations
// (not autowiring) , you can use @Import
// import all beans from AConfiguration into the scope of this configuration class,
// beans can be injected as in the example below
@Import(AConfiguration.class)
public class BConfiguration {

    // inject bean a from AConfiguration
    @Value("#{a}")
    private A a;

    @Bean
    public B b(){
        B b = new B(a);
        return b;
    }
}
