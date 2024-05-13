package Theory.redPackage;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(String name, int money)
    {
        super(name,money);
    }

    public ArrayList<Integer> SendRedPackage(int count, int money){
        ArrayList<Integer> redPackage = new ArrayList<>();
        if (super.getMoney()>= money){
            System.out.println("群主发红包");
            int number = money / count;
            for (int i = 0; i < count-1; i++) {
                redPackage.add(number);
            }
            int last = number+ money % count;
            redPackage.add(last);
            super.setMoney(super.getMoney()-money);
            System.out.println("余额为" + super.getMoney());
        }
        else
        {
            System.out.println("余额不足");
        }
        return redPackage;
    }
}