package Theory.FunctionalInterface;

public class Demo {
    public static void showLog(int level,MyFunctionalInterface mfi){
        if (level == 1)
            mfi.MessageBuilder();
    }

    public static void main(String[] args) {
        String A = "dabai";
        String B = "jiayou";

        showLog(1,()->System.out.println(A+B));
        showLog(2,()->{
            System.out.println("我确实能节省性能");
            System.out.println(A+B);
        });
    }
}
