package BTVN_So4;

import java.util.ArrayList;
import java.util.List;
public class Cart {
    private List<Product> products;
    private List<Integer> quantities;
    private double totalPrice;

    public Cart() {
        products = new ArrayList<>();
        quantities = new ArrayList<>();
        totalPrice = 0.0;
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        quantities.add(quantity);
        totalPrice += product.getPrice() * quantity;
    }

    public double calculateTotalPrice() {
        return totalPrice;
    }
}
