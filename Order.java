public class Order {
    private final double price;
    private final int quantity;
    private final String customerName;
    private final String address;

    public Order(double price, int quantity, String customerName, String address) {
        this.price = price;
        this.quantity = quantity;
        this.customerName = customerName;
        this.address = address;
    }

    public double calculateTotal() {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
        return total;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }
}
