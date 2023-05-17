package BTVN_So4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
// Tạo danh sách sản phẩm
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", "P001", 10.0, "Description 1", (int) 4.5, "Brand 1", new Category("Category 1", "Category description 1", "C001", "Category image 1"), "Image 1"));
        products.add(new Product("Product 2", "P002", 15.0, "Description 2", (int) 4.2, "Brand 2", new Category("Category 2", "Category description 2", "C002", "Category image 2"), "Image 2"));
        products.add(new Product("Product 3", "P003", 20.0, "Description 3", (int) 4.8, "Brand 1", new Category("Category 1", "Category description 1", "C001", "Category image 1"), "Image 3"));


        // Tìm sản phẩm có giá nhỏ nhất và lớn nhất
        double minPrice = Double.MAX_VALUE;
        double maxPrice = Double.MIN_VALUE;
        for (Product product : products) {
            double price = product.getPrice();
            if (price < minPrice) {
                minPrice = price;
            }
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Min Price: " + minPrice);
        System.out.println("Max Price: " + maxPrice);

        // Sắp xếp danh sách sản phẩm theo thứ tự giá tăng dần
        Collections.sort(products, Comparator.comparing(Product::getPrice));
        System.out.println("Sorted Products:");
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
        }
    }
}