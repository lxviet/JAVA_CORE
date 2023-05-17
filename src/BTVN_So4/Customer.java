package BTVN_So4;

public class Customer {
    private String name;
    private String address;
    private String phone;
    private String email;
    private String username;
    private String password;

    public Customer(String name, String address, String phone, String email, String username, String password) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    /**
     * set address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * set password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public void printCustomerInfo() {
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.phone);
        System.out.println(this.email);
        System.out.println(this.username);
        System.out.println(this.password);
    }

}
