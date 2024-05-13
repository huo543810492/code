package Theory.Singleton;

public enum enumWay {
    INSTACNE;
    public void doSomething(){
        System.out.println("do something");
    }

    public static void main(String[] args) {
        enumWay.INSTACNE.doSomething();
    }
}
