package mutaz.code.springcode;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class ShoppingCart {
    List<Product> items = new ArrayList<>();

    public void addItem(Product product){
        this.items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }
}
