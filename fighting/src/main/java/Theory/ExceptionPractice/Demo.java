package Theory.ExceptionPractice;

import java.io.IOException;

public class Demo
{
    public static void main(String[] args) {
        try {
            readFIle("bb");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("资源释放 finally");
        }
        System.out.println("资源释放");
    }

    private static void readFIle(String filePath) throws IOException {
        if (filePath!= "cccc")
            throw new IOException("路径不对");
    }
}
