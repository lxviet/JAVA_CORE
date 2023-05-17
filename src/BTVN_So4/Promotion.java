package BTVN_So4;
import java.util.Date;

public class Promotion {
    private String name;
    private String description;
    private String promotionCode;
    private Date startDate;
    private Date endDate;
    private double discount;

    public boolean isPromotionAvailable() {
        Date currentDate = new Date();
        if (currentDate.after(startDate) && currentDate.before(endDate)) {
            return true;
        } else {
            return false;
        }
    }
}