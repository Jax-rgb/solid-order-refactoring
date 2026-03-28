public class PdfInvoiceGenerator implements InvoiceGenerator {
    @Override
    public void generateInvoice(Order order, String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}
