import solidPrinciples.srp.CartInvoicePrinter;
import solidPrinciples.srp.CartRepository;
import solidPrinciples.srp.Product;
import solidPrinciples.srp.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.add(new Product("GT 650 Chrome", 400000.00));

        CartRepository saveToDB = new CartRepository();
        saveToDB.save(cart);

        CartInvoicePrinter printer = new CartInvoicePrinter();
        printer.print(cart);

        System.out.println("Structure Verified, SRP");
    }
}