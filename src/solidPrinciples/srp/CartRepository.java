package solidPrinciples.srp;

public class CartRepository {
    public void save(ShoppingCart cart){
        System.out.println("[DB] Saving " + cart.getItems().size() + " items to database.");
    }
}
