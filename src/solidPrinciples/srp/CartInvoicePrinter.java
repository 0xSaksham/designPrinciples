package solidPrinciples.srp;

public class CartInvoicePrinter {
    public void print(ShoppingCart cart){
        System.out.println("--- INVOICE ---");
        for(Product p : cart.getItems()){
            System.out.println(p.name + " : ₹" + p.price);
        }
        System.out.println("TOTAL: ₹" + cart.calculateTotalPrice());
    }
}
