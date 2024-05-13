package Algorithm.LinkedListPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class testLinkedList {//之前都是LeetCode写好的链表类，这次用的是JAVA的linkedList
    //比如remove(5), 是移除第五位元素，还是等于五的元素

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(2);
        list.remove((Object)2);//remove object  是移除等于2的元素
        list.remove(2);//是移除第2位元素
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();  // 用迭代器遍历并输出元素
            System.out.println(i);
        }
        System.out.println(list.toString());

    }

}
