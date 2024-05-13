package Theory.Singleton;

import javax.sql.rowset.serial.SerialBlob;
import java.io.*;
import java.sql.Blob;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws FileNotFoundException, SQLException, ClassNotFoundException {
        String a = "af";

        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(a);
            byte[] bytes = bo.toByteArray();
            Blob b = new SerialBlob(bytes);
            byte[] test = b.getBytes(1 ,3);
            System.out.println(test);

//            InputStream
            ByteArrayInputStream in = new ByteArrayInputStream(test,0,3);
//            ObjectInputStream is = new ObjectInputStream(in);
//            String v = String.valueOf(is.readObject());
//            System.out.println(v);
            int c;
            while(( c= in.read())!= -1) {
                System.out.println(Character.toUpperCase((char)c));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

//        b.setBytes(a.to)
//        S.getInstance();+

    }
}
