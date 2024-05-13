package Theory.Factory;

public class Server {
    public static void main(String[] args) {
        Notification sms = NotificationFactory.getNotification("SMS");
        sms.notifyUser();
    }
}
