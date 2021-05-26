package mutaz.code.springcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringCodeApplication {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringCodeApplication.class, args);
        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService.toString());
    }

}
