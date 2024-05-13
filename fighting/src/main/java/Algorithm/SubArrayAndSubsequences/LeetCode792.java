package Algorithm.SubArrayAndSubsequences;

public class LeetCode792 {
//    public int numMatchingSubseq(String S, String[] words) {
//        int res=0;
//        Map<Character, LinkedList<String>> map=new HashMap<>();
//        for(char c='a';c<='z';c++){
//            map.put(c,new LinkedList());
//        }
//        for(String word:words){
//            map.get(word.charAt(0)).add(word);
//        }
//        for(char c:S.toCharArray()){
//            LinkedList<String> list=map.get(c);
//            int size=list.size();
//            for(int i=0;i<size;i++){
//                String s = list.removeFirst();
//                if(s.length()==1)
//                    res++;
//                else {
//                    String newWord=s.substring(1);
//                    map.get(newWord.charAt(0)).add(newWord);
//                }
//            }
//        }
//        return res;
//    }
}
