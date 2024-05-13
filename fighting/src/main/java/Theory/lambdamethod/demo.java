package Theory.lambdamethod;

public class demo {
    public static void pintString(Printable p){
    p.print("hello");
    }

    public static void main(String[] args) {
        pintString((s)->{
            MethodRerObject obj = new MethodRerObject();
//           obj.printUpperCaseString(s);
            pintString(obj::printUpperCaseString);
        });
    }
}
