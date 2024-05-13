package Theory.lambdaPractice;

public class CookDemo {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭no");
            }
        });
        //lambda:
        invokeCook(()->{System.out.println("吃饭no(lambda)");});
    }

    public static void invokeCook(Cook c){
        c.makeFood();
    }
}
