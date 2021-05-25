package mutaz.code.springcode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

      @Bean
      public Product aaa(){
          Battery p1 = new Battery("AAA",2.5,true);
          return p1;
      }

      @Bean
      public Product cdrw(){
          Disc p2 = new Disc("CD-RW",1.5,200);
          return p2;
      }
}
