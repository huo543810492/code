package Theory.GenericTest;

import java.util.ArrayList;

public class Generic
{
    public <T> ArrayList<Object> addE (ArrayList<Object>list,T t){
        list.add(t);
        return list;
    }
}
