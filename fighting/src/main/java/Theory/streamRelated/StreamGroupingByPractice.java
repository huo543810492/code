package Theory.streamRelated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 需求，现在有很多订单，有一个list，list可能包括很多币种，asset币种string，amount资产，现在想要返回一个Map<String, BigDecimal> result
 * String是asset币种，Bigdecimal是资产amount的总和
 */
public class StreamGroupingByPractice {
    public static void main(String[] args) {
        NewSpotOrder newSpotOrder1 = new NewSpotOrder();
        NewSpotOrder newSpotOrder2 = new NewSpotOrder();
        NewSpotOrder newSpotOrder3 = new NewSpotOrder();
        newSpotOrder1.setSymbol("BTC");
        newSpotOrder1.setVolume(new BigDecimal("1.1"));
        newSpotOrder2.setSymbol("BTC");
        newSpotOrder2.setVolume(new BigDecimal("1.2"));
        newSpotOrder3.setSymbol("ETH");
        newSpotOrder3.setVolume(new BigDecimal("1.5"));
        List<NewSpotOrder> list = new ArrayList<>();
        list.add(newSpotOrder1);
        list.add(newSpotOrder2);
        list.add(newSpotOrder3);

        Map<String, BigDecimal> collect = list.stream().filter(order -> Optional.ofNullable(order).isPresent())
                                                        .collect(Collectors.groupingBy(NewSpotOrder::getSymbol, Collectors.reducing(BigDecimal.ZERO, NewSpotOrder::getVolume, BigDecimal::add)));
        System.out.println(collect);
    }
}
