package mutaz.code.springcode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

      // a bean will be added to the context with the name bookRepository which
      // is the same as the method name
      @Bean
      public BookRepository bookRepository(){
          return new BookRepository();
      }

      @Bean
      public MailService mailService(){
          return new MailService();
      }

      @Bean
      public BookService bookService(){
          // constructor injection
          // the bookRepository() will actually refer to the bean and it will
          // actually call the method
          BookService bookService = new BookService(bookRepository());
          // setter injection
          bookService.setMailService(mailService());
          return bookService;
      }
}
