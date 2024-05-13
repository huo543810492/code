public class PrintArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("--------------------");
        for(int j : a)
            System.out.println(j);
    }
}
