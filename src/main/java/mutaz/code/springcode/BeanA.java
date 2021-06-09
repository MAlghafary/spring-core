package mutaz.code.springcode;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class BeanA {

    public BeanA() {
        System.out.println("Creating beanA");
    }

    @IgnoreThis
    public void test(){
        System.out.println("inside method test");
    }

    public void init(){
    }

    public void destroy(){
    }
}
