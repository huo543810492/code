package Theory.AOP;

public class NewClass extends OriginalClass{
    public void newMethod(){
        System.out.println("add logs");
        System.out.println("add validation");
        super.method();
    }

    public static void main(String[] args) {
        NewClass c = new NewClass();
        c.newMethod();
    }
}
