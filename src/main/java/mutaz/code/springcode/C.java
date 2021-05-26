package mutaz.code.springcode;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("C")
//@Qualifier("C")
public class C implements A{
    @Override
    public void print(String text) {
        System.out.println(text + "from C");
    }
}
