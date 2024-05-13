package Theory.redPackage;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(String name,int money){
        super(name,money);
    }

    public void receiveMoney(ArrayList<Integer> redPackage){
        int index = new Random().nextInt(redPackage.size());
        int money = redPackage.remove(index);
        super.setMoney(getMoney()+money);
        System.out.println(super.getName() + "抢到红包了，余额是" + super.getMoney());
    }
}
