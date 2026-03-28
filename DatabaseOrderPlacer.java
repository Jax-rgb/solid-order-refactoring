public class DatabaseOrderPlacer implements OrderPlacer {
    @Override
    public void placeOrder(Order order) {
        System.out.println("Order placed for " + order.getCustomerName() + " at " + order.getAddress());
    }
}
