package Algorithm.SlidingWindow;

public class LeetCode1456 {
    public static int maxVowels(String s, int k) {
        int sum = 0;
        int left =0;
        int result = 0;

        if (s == null)
            return 0;
        char[] array = s.toCharArray();
        for(int i=0;i<array.length;i++){
            if(i <k){//写法巧妙，
                sum += isVowelLetter(array[i]);
            }

            else{
                sum -= isVowelLetter(array[left]);
                left++;
                sum += isVowelLetter(array[i]);
            }
            result = Math.max(result,sum);//这里看似当然其实关键，不要忽略在i<k时，result 和sum的比较，因为可能第一个K定长的数组的值是最大，else上来sum就去减值，这样可能忽略了第一个sum
        }
        return result;
    }

    public static int isVowelLetter (char c){
        if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u')
            return 1;
        else
            return 0;
    }


    public static void main(String[] args) {
        System.out.println(maxVowels("ibpbhixfiouhdljnjfflpapptrxgcomvnb",33));
    }
}
