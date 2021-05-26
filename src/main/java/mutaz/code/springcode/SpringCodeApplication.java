package mutaz.code.springcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringCodeApplication {
    public static void main(String[] args) {

        // If you have multiple config classes, and you need to only autowire ( no @Bean )
        // then you can do something like this
        //new AnnotationConfigApplicationContext(AConfiguration.class,BConfiguration.class);

        // if you need to use @Bean for more control, you need to use @import , see BConfiguration
        ApplicationContext context = SpringApplication.run(SpringCodeApplication.class, args);
        B b = context.getBean(B.class);
    }

}
