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
        Printer printer = context.getBean(Printer.class);
        printer.print();
    }

    @Bean
    // it is important to keep the name as messageSource , otherwise
    // this will not work 
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:ui");
        messageSource.setCacheSeconds(1);
        return messageSource;
    }

}
