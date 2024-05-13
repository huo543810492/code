package Theory.ExceptionPractice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class DemoRegisterException
{
    public static void main(String[] args) throws RegisterException {
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set,"大白","伊东美咲");
        Scanner sc = new Scanner(System.in);
        RegisterCheck(sc.next(),set);
    }

    private static void RegisterCheck(String s,HashSet<String> set) throws RegisterException {
        if (set.contains(s)){
            throw new RegisterException("用户已存在！");
        }
        else System.out.println("注册成功！");
    }
}
