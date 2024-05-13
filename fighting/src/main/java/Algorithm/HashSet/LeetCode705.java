//package HashSet;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class LeetCode705 {
//
//    Bucket[] array = new Bucket[1000];
//    public MyHashSet() {
//        for(int i=0;i<array.length;i++)
//            array[i]=new Bucket();
//    }
//
//    public void add(int key) {
//        int index=hash(key);
//        array[index].insert(key);
//    }
//
//    public void remove(int key) {
//        int index=hash(key);
//        array[index].delete(key);
//    }
//
//    public boolean contains(int key) {
//        int index=hash(key);
//        return array[index].exist(key);
//    }
//
//    public int hash(int key) {
//        return key%1000;
//    }
//
//    class Bucket{//为什么要用一个新的类，因为纯linkedList可以存储重复元素
//
//        private LinkedList <Integer> list;
//        public Bucket(){
//            this.list=new LinkedList<>();
//        }
//
//        public void insert(int num){
//            if(!list.contains(num))
//                this.list.addFirst(num);
//        }
//
//        //这个Integer非常关键，如果是int是删除下标为num的节点，而object，Integer是删除值为num的点
//        public void delete(Integer num){
//            this.list.remove(num);
//        }
//
//        public boolean exist(int num){
//            return list.contains(num);
//        }
//
//    }
//
//
//
//    public static void main(String[] args) {
//        LeetCode705 test=new LeetCode705();
//        test.add(1);
//        test.add(2);
//        test.contains(1);
//        test.remove(2);
//    }
//}
