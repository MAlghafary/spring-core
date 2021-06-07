package mutaz.code.springcode;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanB {

    public BeanB(){
        System.out.println("Creating BeanB");
    }

    public void init(){
    }

    public void destroy(){
    }
}
