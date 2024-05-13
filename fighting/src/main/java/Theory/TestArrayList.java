import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random =new Random();
        for (int i =0; i < 6 ; i++){
            int r = random.nextInt(33)+1;
            array.add(r);
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        List<Integer> integers = new ArrayList<>();
    }
}
