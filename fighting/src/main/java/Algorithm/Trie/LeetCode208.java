package Algorithm.Trie;

import java.util.HashMap;
import java.util.Map;

public class LeetCode208 {
    class Trie {

        private Map<Character, Trie> map;
        private boolean isEnd;

        public Trie() {
            map = new HashMap<>();
        }

        public boolean getIsEnd() {
            return isEnd;
        }

        public void setIsEnd() {
            isEnd = true;
        }

        public Trie get(char ch) {//关键0 这个看似不重要，其实很重要，因为之后要用当前trie下的map去get，set，而不是直接map
            return map.get(ch);
        }

        public void put(char ch, Trie node) {
            map.put(ch, node);
        }

        public void insert(String word) {
            Trie temp = this;//关键1
            for (char c : word.toCharArray()) {
                if (temp.get(c) != null)//关键2，这里得一直拿着最新的temp，为了最后senEnd
                    temp = temp.get(c);

                else {
                    Trie trie = new Trie();//关键3，不要temp=new XXX
                    temp.put(c, trie);//因为这里还要Put
                    temp = trie;
                }
            }
            temp.setIsEnd();
        }

        public boolean search(String word) {
            Trie temp = this;
            for (char c : word.toCharArray()) {
                if (temp.get(c) != null)
                    temp = temp.get(c);//这里得一直拿着最新的temp，为了检查isEnd
                else
                    return false;
            }
            return temp.getIsEnd();
        }

        public boolean startsWith(String prefix) {
            Trie temp = this;
            for (char c : prefix.toCharArray()) {
                if (temp.get(c) == null)
                    return false;
                else
                    temp = temp.get(c);//这里得一直拿着最新的temp，虽然不检查isEnd了，但是还是得往下捋
            }
            return true;
        }
    }
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
