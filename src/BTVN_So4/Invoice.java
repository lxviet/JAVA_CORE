package BTVN_So4;
import java.util.Date;
import java.util.List;
public class Invoice {
    private String invoiceNumber;
    private Date purchaseDate;
    private double totalPrice;
    private List<Product> products;
    private List<Integer> quantities;
    private List<Double> prices;

    public void printInvoiceDetails() {
        System.out.println("Mã hoá đơn: " + invoiceNumber);
        System.out.println("Ngày mua: " + purchaseDate);
        System.out.println("Tổng tiền: " + totalPrice);
        System.out.println("Sản phẩm: ");
        for (int i = 0; i < products.size(); i++) {
            System.out.println("- " + products.get(i).getNameProduct() + " x " + quantities.get(i) + " = " + prices.get(i));
        }
    }
}
