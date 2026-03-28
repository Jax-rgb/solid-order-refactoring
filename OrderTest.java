public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(10.0, 2, "John Doe", "123 Main St");

        OrderPlacer placer = new DatabaseOrderPlacer();
        InvoiceGenerator generator = new PdfInvoiceGenerator();
        NotificationSender sender = new EmailNotificationSender();

        OrderProcessor processor = new OrderProcessor(placer, generator, sender);

        processor.processOrder(order, "order_123.pdf", "johndoe@example.com");
    }
}
