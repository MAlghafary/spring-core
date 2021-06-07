package mutaz.code.springcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Arrays;

@SpringBootApplication
public class SpringCodeApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCodeApplication.class, args);


        //BeanA beanA = context.getBean(BeanA.class);
        //BeanB beanB = context.getBean(BeanB.class);
        //System.out.println(context.getBeanDefinitionNames());
    }

    @Bean()
    public BeanA beanA(){
        return new BeanA();
    }

    @Bean
    @Lazy
    // By default, Spring performs eager initialization on all POJOs
    // This means POJOs are initialized at startup. In
    //certain circumstances, though, it can be convenient to delay the POJO initialization
    // process until a bean is required. Delaying the initialization is called lazy initialization.
    public BeanB beanB(){
        return new BeanB();
    }
}
