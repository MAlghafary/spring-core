package mutaz.code.springcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringCodeApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCodeApplication.class, args);
        Product a = context.getBean("A", Product.class);
        Product b = context.getBean("B", Product.class);
        Product c = context.getBean("C", Product.class);
        ShoppingCart cart1 = context.getBean(ShoppingCart.class);
        cart1.addItem(a);
        cart1.addItem(b);
        // The default bean scope in spring is singleton , so the same
        // shopping cart will be returned here
        // to change this to another scope , you can use
        // @Scope()
        // Scopes values includes : singleton , prototype,request,session
        ShoppingCart cart2 = context.getBean(ShoppingCart.class);
        cart2.addItem(c);

        System.out.println(cart1.getItems());
        System.out.println(cart2.getItems());
    }

}
