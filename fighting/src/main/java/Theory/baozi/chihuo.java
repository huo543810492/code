package Theory.baozi;

public class chihuo extends Thread{
    private baozi bz;

    public chihuo(baozi bz) {
    this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.getStatus()==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("吃货开始吃"+ bz.getPi() + bz.getXina()+ "包子");
                    System.out.println("吃货吃完了"+ bz.getPi() + bz.getXina()+ "包子");
                    bz.setStatus(false);
                    bz.notify();
                    System.out.println("================================================");
                }
            }
        }

    }
}
