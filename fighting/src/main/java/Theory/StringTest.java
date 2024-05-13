public class StringTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(fromArrayToString(array));
    }
    public static String fromArrayToString(int[]array){
        String result = "[";
        for (int i = 0; i < array.length; i++) {

            if (i==array.length-1)
                result +="Word" + array[i] +"]";
            else
                result += "Word" +array[i]+ "@";
        }
        return result;
    }

}

