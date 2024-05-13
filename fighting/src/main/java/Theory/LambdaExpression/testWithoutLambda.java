package Theory.LambdaExpression;

public class testWithoutLambda {
    public static void printLog(int level, String message){
        if(level==1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        printLog(2,a+b);
    }
}
