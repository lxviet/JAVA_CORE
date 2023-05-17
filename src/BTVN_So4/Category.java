package BTVN_So4;

public class Category {
    private String name;
    private String description;
    private String categoryId;
    private String image;

    /**
     * Comstructor
     */
    public Category(String name, String description, String categoryId, String image) {
        this.name = name;
        this.description = description;
        this.categoryId = categoryId;
        this.image = image;
    }

    /**
     * print value name of category
     */
    public void printCategoryName() {
        System.out.println(this.name);
    }
}
