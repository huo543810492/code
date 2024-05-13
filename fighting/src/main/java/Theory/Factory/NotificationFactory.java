package Theory.Factory;

public class NotificationFactory {
    public static Notification getNotification(String channel){
        switch (channel){
            case "SMS":
                return new SMSNotification();
            case "Email":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Unknown channel" + channel);
        }
    }

}
