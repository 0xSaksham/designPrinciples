package solidPrinciples.srp;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> items = new ArrayList<>();

    public void add(Product p){
        items.add(p);
    }

    public List<Product> getItems(){
        return items;
    }

    public double calculateTotalPrice(){
        return items.stream().mapToDouble(p-> p.price).sum();
    }
}
