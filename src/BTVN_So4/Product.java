package BTVN_So4;

public class Product {
    private String nameProduct;
    private String productId;
    private double price;
    private String description;
    private int rating;
    private String brand;
    private Category category;
    private String image;

    /**
     * Constructor
     *
     */
    public Product(String nameProduct, String productId, double price, String description, int rating, String brand, Category category, String image) {
        this.nameProduct = nameProduct;
        this.productId = productId;
        this.price = price;
        this.description = description;
        this.rating = rating;
        this.brand = brand;
        this.category = category;
        this.image = image;
    }

    /**
     * set value name
     * @param nameProduct
     *
     */
    public void setName(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * print
     */
    public void printProductInfo() {
        System.out.println(this.nameProduct);
        System.out.println(this.productId);
        System.out.println(this.price);
        System.out.println(this.description);
        System.out.println(this.rating);
        System.out.println(this.brand);
        System.out.println(this.category);
        System.out.println(this.image);
    }

    public double getPrice() {
        return price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getName() {
        return nameProduct;
    }
}
