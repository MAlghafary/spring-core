package mutaz.code.springcode.print;

import org.springframework.stereotype.Component;

// Another method to define beans in the spring container
// is to use the @Component annotation or one of similar annotations
// this feature is called component scanning , it also applies to
// annotations including @Repository,@Service,@Controller,@RestController
// and others
@Component
public class StdOutPrinter implements Printer{

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
