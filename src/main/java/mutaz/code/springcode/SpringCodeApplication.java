package mutaz.code.springcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Arrays;

@SpringBootApplication
public class SpringCodeApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCodeApplication.class, args);
        BeanA beanA = context.getBean(BeanA.class);
        BeanB beanB = context.getBean(BeanB.class);

    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public BeanA beanA(){
        return new BeanA();
    }
}
