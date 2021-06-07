package mutaz.code.springcode;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanB {

    public BeanB() {
        throw new RuntimeException();
    }

    public void init(){
    }

    public void destroy(){
    }
}
