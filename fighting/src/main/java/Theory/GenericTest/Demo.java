package Theory.GenericTest;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Generic gc = new Generic();
        ArrayList list = new ArrayList();
        gc.addE(list,3213);
        gc.addE(list,"伊东美咲");
        gc.addE(list,51.5);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
