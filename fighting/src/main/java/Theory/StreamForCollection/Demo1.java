package Theory.StreamForCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1
{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"大白","伊东美咲","伊东美咲最漂亮");
        arrayList.stream()
                .filter(name->name.startsWith("伊"))
                .filter(name->name.length()==4)
                .forEach(name -> System.out.println(name));
    }
}
