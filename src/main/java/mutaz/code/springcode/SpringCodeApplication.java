package mutaz.code.springcode;

import mutaz.code.springcode.print.Printer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@SpringBootApplication
// The default behavior for component scan is to detect all classes decorated with
// - @Configuration,@Bean,@Component,@Repository,@Service,@Controller, among others

// you can customize the scan process by adding include/exclude filters,filters
// have different types : regex,aspectJ,annotation,custom

// This is helpful when a Java package has dozens or hundreds of classes. For
//certain Spring application contexts, it can be necessary to exclude or include POJOs
// with certain annotations.

// The different filter types :
// https://www.baeldung.com/spring-componentscan-filter-type
@ComponentScan(
        includeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = {"mutaz.code.springcode.Foo"})
        },
        excludeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.ANNOTATION,
                        classes = {org.springframework.stereotype.Component.class}
                )
        })
public class SpringCodeApplication {
    public static void main(String[] args) {
        // Spring provides 2 types of containers , the bean factory
        // and the ApplicationContext , the Application Context is
        // the more advanced one
        ApplicationContext context = SpringApplication.run(SpringCodeApplication.class, args);
        SequenceGenerator sequenceGenerator = context.getBean(SequenceGenerator.class);
        System.out.println(sequenceGenerator.getNext());


        Foo foo = context.getBean(Foo.class);
        System.out.println(foo.name());

        //Printer printer = context.getBean(Printer.class);
        //printer.print("Welcome to Spring core");
    }

}
