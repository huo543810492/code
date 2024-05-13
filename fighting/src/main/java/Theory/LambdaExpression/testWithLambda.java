package Theory.LambdaExpression;

public class testWithLambda {
    public static void printLog(int level,MessageBuilder builder)
    {
        if(level==1)
            System.out.println(builder.getMessage());
    }

    public static void main(String[] args) {
        String a="a";
        String b="b";
        printLog(2,()->a+b);
    }
}
