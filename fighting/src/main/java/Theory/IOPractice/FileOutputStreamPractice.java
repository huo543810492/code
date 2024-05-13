package Theory.IOPractice;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamPractice
{
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("D:\\编程\\tmall_Springboot\\final project\\Demo\\src\\IOPractice\\a.txt");
        fos.write(49);
        fos.write(48);
        fos.write(48);
        fos.write("伊东美咲最漂亮！！".getBytes());//把字符串转换成字节
        fos.close();
    }

}
