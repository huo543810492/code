//package Top100LikedQuestions;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//
//public class leetCode56 {
//    public int[][] merge(int[][] intervals) {
//        Arrays.sort(intervals, (a,b)->a[0]-b[0]); //记住二维数组如何排序
//        LinkedList<int[]> mergeList = new LinkedList();//LinkedList有getLast方法
//        for(int[] array: intervals)
//        {
//            if(mergeList.size()==0 || mergeList.getLast()[1]<array[0])//如果上个int[]的第二个元素小于现在int[]的第一个元素，那么没有发生overlap
//            {
//                mergeList.add(array);
//            }
//
//            else //发生了overlap，那么势必两个int[] 会变成一个int[] 就看谁的index为1的元素大了
//            {
//                mergeList.getLast()[1] = Math.max(mergeList.getLast()[1],array[1]);
//            }
//        }
//
//        return mergeList.toArray(new int[mergeList.size()][]);
//    }
