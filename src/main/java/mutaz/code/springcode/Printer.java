package mutaz.code.springcode;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Locale;

@Component
public class Printer {

    private MessageSource messageSource;

    public Printer(MessageSource messageSource){
        this.messageSource = messageSource;
    }

    public void print(){
        String msg1 = messageSource.getMessage("alert.checkout",null, Locale.US);
        String msg2 = messageSource.getMessage("alert.inventory.checkout",
                new Object[]{"[DVD-RW 3.0]",new Date()},Locale.US);
        System.out.println(msg1);
        System.out.println(msg2);
    }
}
