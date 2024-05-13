package Theory.IOPractice;

import java.io.*;
import java.util.HashMap;

public class OrderTextPractice {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\编程\\tmall_Springboot\\final project\\Demo\\src\\IOPractice\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\编程\\tmall_Springboot\\final project\\Demo\\src\\IOPractice\\out.txt"));
        String line;
        while ((line = br.readLine()) != null){
            String[] arr = line.split("\\.");//"."的转义字符，通过数组把序号和内容分开
            map.put(arr[0],arr[1]);
        }
        for (String key : map.keySet()){
            String value = map.get(key);
            line = key + "." +value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
