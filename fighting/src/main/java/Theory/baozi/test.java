package Theory.baozi;

public class test {
    public static void main(String[] args) {
        baozi bz = new baozi();
        new baozipu(bz).start();
        new chihuo(bz).start();

    }
}
