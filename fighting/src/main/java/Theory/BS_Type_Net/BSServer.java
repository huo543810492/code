package Theory.BS_Type_Net;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//创建BS版本的TCP服务器
//可以自己先用浏览器测试http://127.0.0.1:8080/Demo/web/index.html，访问服务器
//找到Demo项目下的web文件夹通过它连接服务器
public class BSServer {
    public static void main(String[] args) throws IOException {
        //传建一个服务器ServerSocket，和系统要指定的端口号
        ServerSocket server = new ServerSocket(8080);
        while (true){
            //使用accept方法获取到请求的客户端对象（浏览器）
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //使用Socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
                        //只获取浏览器请求的文件名称，不用获取其他信息
                        //把is网络字节输入流对象，转换为字符缓冲输入流
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        //通过readline,把请求信息的第一行读出来 GET /Demo/web/index.html HTTP/1.1
                        String line = br.readLine();
                        //对读取的信息进行切割，只要中间部分/Demo/web/index.html HTTP/1.1
                        String[] arr = line.split(" ");
                        //把路径前边的/去掉，进行截取Demo/web/index.html HTTP/1.1
                        String htmlpath = arr[1].substring(1);

                        //创建一个本地字节输入流，构造方法中绑定要读取的html路径
                        FileInputStream fis = new FileInputStream("D:\\编程\\tmall_Springboot\\final project\\"+htmlpath);
                        //使用Socket中的方法getOutputStream获取网络字节输出流OutputSream对象
                        OutputStream os = socket.getOutputStream();

                        //写入HTTP协议响应头，固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        //必须写入空行，否则浏览器不解析
                        os.write("\r\n".getBytes());

                        //一读一写，复制文件，把服务器读取的html文件回写到客户端
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes))!= -1){
                            os.write(bytes,0,len);
                        }
                        fis.close();
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }

                }
            }).start();
        }
        //server.close();
    }
}
