package Theory.Factory;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("notify user by SMS");
    }
}
