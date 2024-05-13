package Theory.Reflect;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
//        ClassLoader classLoader = ReflectTest.class.getClassLoader();
//        InputStream is = classLoader.getResourceAsStream("pro.properties");
        properties.load(new FileInputStream("D:\\编程\\tmall_Springboot\\final project\\Demo\\src\\pro.properties"));

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //将字节码文件加载进内存，返回class对象
        Class cls = Class.forName(className);
        //创建对象
        Object obj = cls.newInstance();
        //获取方法对象
        Method method = cls.getMethod(methodName);
        //执行方法
        method.invoke(obj);
    }

}
