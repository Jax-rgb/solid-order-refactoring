public class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendEmailNotification(Order order, String email) {
        System.out.println("Email notification sent to: " + email);
    }
}
