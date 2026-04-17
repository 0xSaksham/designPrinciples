package solidPrinciples.srp;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

class Product{
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart{
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getProducts(){
        return products;
    }

    public double calculateTotalPrice(){
        double total = 0;

        for(Product p : products) total+= p.getPrice();

        return total;
    }
}

class ShoppingCartInvoicePrinter {
    private final ShoppingCart shoppingCart;

    public ShoppingCartInvoicePrinter(ShoppingCart shoppingCart){
        this.shoppingCart= shoppingCart;
    }

    public void printInvoice(){
        System.out.println("---Invoice---");

        for(Product p : shoppingCart.getProducts()) System.out.println(p.getName() + " - Rs " + p.getPrice());
        System.out.println("Total: Rs " + shoppingCart.calculateTotalPrice());
    }
}

class ShoppingCartDatabaseStorage {
    private ShoppingCart shoppingCart;

    public ShoppingCartDatabaseStorage(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    public void saveToDatabase(){
        System.out.println("Saving Changes to your cart....");
    }
}


public class SRPShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("HP Laptop", 60000.00));
        cart.addProduct(new Product("Mouse", 5000));

        ShoppingCartInvoicePrinter printer = new ShoppingCartInvoicePrinter(cart);
        printer.printInvoice();

        ShoppingCartDatabaseStorage db = new ShoppingCartDatabaseStorage(cart);
        db.saveToDatabase();

        System.out.println("Thank you for shopping with us!");
    }
}
