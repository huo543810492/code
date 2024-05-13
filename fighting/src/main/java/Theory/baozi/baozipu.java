package Theory.baozi;

public class baozipu extends Thread{
    private baozi bz;

    public baozipu(baozi bz) {
        this.bz=bz;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            synchronized (bz){
             if (bz.getStatus()==true)  {
                 try {
                     bz.wait();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }else {
                 if (i%2==0){
                     bz.setPi("薄皮");
                     bz.setXina("猪肉大葱");
                 }
                 else {
                     bz.setPi("薄皮");
                     bz.setXina("三鲜");
                 }
                 bz.setStatus(true);
                 i++;
                 System.out.println("开始制作"+ bz.getPi() + bz.getXina() + "包子");
                 try {
                     Thread.sleep(5000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 System.out.println("包子做好了,快来吃");
                 bz.notify();
             }
            }
        }
    }
}
