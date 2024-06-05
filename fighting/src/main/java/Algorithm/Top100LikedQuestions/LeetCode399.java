package Algorithm.Top100LikedQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 先战略放弃
 * Input: equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
 * Output: [6.00000,0.50000,-1.00000,1.00000,-1.00000]
 * Explanation:
 * Given: a / b = 2.0, b / c = 3.0
 * queries are: a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ?
 * return: [6.0, 0.5, -1.0, 1.0, -1.0 ]
 * note: x is undefined => -1.0
 */

public class LeetCode399 {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String,Double> equationMap = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String dividend = equations.get(i).get(0); //被除数
            String divisor = equations.get(i).get(1); //被除数
            double times = values[i];
            equationMap.put(dividend+divisor,times);
        }
        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> strings = queries.get(i);
            String dividend = strings.get(0);
            String divisor = strings.get(1);
            if(dividend.equals(divisor)){
                result[i] = 1;
            }else {
                result[i] = equationMap.get(dividend+divisor) == null? -1:equationMap.get(dividend+divisor);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode399 test = new LeetCode399();
        List<String> ab = Arrays.asList("a","b");
        List<String> bc = Arrays.asList("b","c");
        double[] values = {2.0,3.0};
        List<List<String>> equations = Arrays.asList(ab,bc);

        List<String> ac = Arrays.asList("a","c");
        List<String> ba = Arrays.asList("b","a");
        List<String> ae = Arrays.asList("a","e");
        List<String> aa = Arrays.asList("a","a");
        List<String> xx = Arrays.asList("x","x");
        List<List<String>> queries = Arrays.asList(ac,ba,ae,aa,xx);

        test.calcEquation(equations,values,queries);
    }
}
