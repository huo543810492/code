package Theory.redPackage;

import java.util.ArrayList;

public class MainDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("大白", 110);
        Member member1 = new Member("伊东美咲",0);
        Member member2 = new Member("东凛",0);
        ArrayList<Integer> redPackage = manager.SendRedPackage(2,109);
        member1.receiveMoney(redPackage);
        member2.receiveMoney(redPackage);
    }
}
