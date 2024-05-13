package Theory.Factory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("notify user by Email");
    }
}
