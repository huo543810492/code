package Theory.mapRelated;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 把一个币种(usdt)的records全部取出并放到一个map中，现在要把这些usdt的值累加，并且加到totalMap中返回(totalMap可能已经有usdt的值了)
 */

public class MapMergePractice {

    public static void main(String[] args) {
        final String USDT = "usdt";

        //要统计不同币种的总金额
        Map<String, BigDecimal> totalMap = new ConcurrentHashMap<>();
        //统计usdt的用户id和金额
        Map<String,Map<Long,BigDecimal>> usdtMap = new ConcurrentHashMap<>();
        usdtMap.put(USDT, new ConcurrentHashMap<Long, BigDecimal>() {
            {
                put(1L, BigDecimal.valueOf(10.5));
                put(2L, BigDecimal.valueOf(20.7));
            }
        });

        totalMap.put(USDT, BigDecimal.ONE);
        //把usdtMap中的值统计到totalMap中
        usdtMap.get(USDT).forEach((key,value)->totalMap.merge(USDT,value,(v1,v2)->v1.add(value)));
        System.out.println(totalMap.toString());
    }
}
