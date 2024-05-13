public class Recurison {
    public static void main(String[] args) {
        System.out.println(RecurisonMethod(8));
    }
    private static int RecurisonMethod(int n) {
        if (n==1){
            return 1;
        }
        else return n + RecurisonMethod (n-1);
    }

}
