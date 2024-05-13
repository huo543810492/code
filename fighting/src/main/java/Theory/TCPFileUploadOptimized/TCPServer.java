package Theory.TCPFileUploadOptimized;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建一个服务器ServerSocket对象，和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        while (true){//服务器一直让他开着
            //2.使用ServerSocket对象中的方法accept,获取到请求的客户端Socket对象
            Socket socket = server.accept();
            //使用多线程技术，提高程序的效率，有客户端上传文件，就开启一个线程，完成文件上传
            //如果工作时候直接去用线程池，不要这样写，工作中都是线程池
            //3.使用Socket对象中的方法getInputSteam,获取到网络字节输入流InputStream对象
            new Thread(new Runnable() {
                @Override
                public void run() {//主要run方法没有throw exception，所以用try catch
                    try {
                        InputStream is = socket.getInputStream();
                        //4.判断"D:\\编程\\tmall_Springboot\\final project\\Demo\\src\\TCPFileUpload\\upload\\psb.jpg"文件夹是否存在
                        //自定义一个文件的命名规则：防止同名文件被覆盖，规则：域名+毫秒值+随机数
                        String fileNmae = "dabai" + System.currentTimeMillis()+ new Random().nextInt(99999999);
                        File file = new File("D:\\编程\\tmall_Springboot\\final project\\Demo\\src\\TCPFileUploadOptimized\\upload");
                        if(!file.exists())
                            file.mkdir();
                        //5.创建一个本地字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地
                        FileOutputStream fos = new FileOutputStream("D:\\编程\\tmall_Springboot\\final project\\Demo\\src\\TCPFileUploadOptimized\\upload\\" + fileNmae);
                        //6.使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes))!= -1){
                            //7.使用本地字节输出流FileOutputStream对象中的方法write,把读到的文件保存到服务器的硬盘上
                            fos.write(bytes,0,len);
                        }
                        //8.使用Socket对象中的getOutputStream获取网络字节输出流OutputStream对象
                        //9.使用网络字节输出流OutputStream对象中的方法write,给客户端回写“上传成功”
                        socket.getOutputStream().write("上传成功".getBytes());
                        //10.释放资源
                        fos.close();
                        socket.close();
                    }
                    catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
        //服务器就先不关闭了
        //server.close();
    }
}
