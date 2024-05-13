package Theory.SerializePractice;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Demo
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> arr = new ArrayList<>();
        Collections.addAll(arr,new Person(("大白"),26),new Person(("伊东美咲"),18));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\编程\\tmall_Springboot\\final project\\Demo\\src\\SerializePractice\\out.txt"));
        oos.writeObject(arr);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\编程\\tmall_Springboot\\final project\\Demo\\src\\SerializePractice\\out.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);

    }
}
