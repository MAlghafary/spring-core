package mutaz.code.springcode;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class B implements A{
    @Override
    public void print(String text) {
        System.out.println(text + " From B");
    }
}
