package Theory.listtest;
import java.util.ArrayList;
import java.util.List;

public class lista {
    private List<String> a;

    public void tryAdd(String b){
        this.a = new ArrayList<>();
        this.a.add("bbb");
        System.out.println(this.a.get(0));
    }
}
