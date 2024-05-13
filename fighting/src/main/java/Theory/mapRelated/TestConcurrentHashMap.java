package Theory.mapRelated;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
        Map<String,Integer> map = new ConcurrentHashMap<>();
        final String BAI = "bai";
        map.put(BAI,0);
        Thread t1 = new Thread(()->{
            for (int i=0;i<1000;i++){
                map.compute(BAI,(key,value)-> {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return value==null?1:value+1;
                });
            }
        },"t1");

        Thread t2 = new Thread(()->{
            for (int i=0;i<1000;i++){
                map.compute(BAI,(key,value)->{
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return value==null?1:value+2;
                });
            }
        },"t2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(map.get(BAI));
    }
}
