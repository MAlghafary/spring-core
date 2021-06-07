package mutaz.code.springcode;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanB {

    @PostConstruct
    public void init(){
        System.out.println("BeanB , .. init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("BeanB, .. destroy");
    }
}
