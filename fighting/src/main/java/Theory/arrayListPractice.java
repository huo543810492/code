import java.util.ArrayList;

public class arrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("松井珠理奈");
        array.add("小泉今日子");
        array.add("伊东美咲");

        printArrayList(array);
    }

    public static void printArrayList(ArrayList<String> array){
        System.out.print("{");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
            if (i == array.size()-1)
            {
                System.out.print("}");
            }
            else
                System.out.print("@");
        }
    }
}
