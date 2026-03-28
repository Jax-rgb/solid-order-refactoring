public class OrderProcessor {
    private final OrderPlacer orderPlacer;
    private final InvoiceGenerator invoiceGenerator;
    private final NotificationSender notificationSender;

    public OrderProcessor(OrderPlacer orderPlacer,
                          InvoiceGenerator invoiceGenerator,
                          NotificationSender notificationSender) {
        this.orderPlacer = orderPlacer;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationSender = notificationSender;
    }

    public void processOrder(Order order, String fileName, String email) {
        order.calculateTotal();
        orderPlacer.placeOrder(order);
        invoiceGenerator.generateInvoice(order, fileName);
        notificationSender.sendEmailNotification(order, email);
    }
}
