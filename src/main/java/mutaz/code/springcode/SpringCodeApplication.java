package mutaz.code.springcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringCodeApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCodeApplication.class, args);
        Double discount = context.getBean(Double.class);
        System.out.println(discount);
    }

}
