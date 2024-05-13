package Theory.mapRelated;

import java.util.concurrent.ConcurrentHashMap;

/**
 * compute 方法：compute 方法允许你根据给定的键计算一个新值并将其存储回 Map 中。
 * 它的签名是 compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)。
 * 这个方法是线程安全的，因为它在内部使用了一种称为锁分段（lock striping）的技术，它允许多个线程同时修改 Map，而不会导致死锁或竞争条件。
 * merge 方法：merge 方法将给定的键和值合并到 Map 中。
 * 它的签名是 merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)。
 * 这个方法也是线程安全的，它使用了乐观锁技术，确保在多线程环境中安全地合并键值对，而不会引起竞态条件。
 */
public class ComputeAndMerge {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("USDT",11);
        map.compute("USDT", (key,value) -> (value == null) ? 1: value+1);//remappingFunction,适用于多线程赋值时候用
        map.put("ETH",11);

        ConcurrentHashMap<String, Integer> totalMap = new ConcurrentHashMap<>();
        totalMap.put("USDT",33);
        totalMap.put("DOGE",22);

//        map.forEach((key,value)中的value == newValue, value是map中的value，现在要合到totalMap中，所以在totalMap中是newValue
//        oldValue: 在 totalMap 中与 "key" 当前关联的值（如果存在的话）。
//        newValue: 正在尝试添加到 "key" 下的值，这里即 map 的当前迭代值 value。
//        在每次调用 merge 方法时，value（当前从 map 中提取的值）作为 newValue 传入。
//        所以，在您的合并函数中，newValue 等于每次迭代时从 map 中获取的 value。
        map.forEach((key,value)->totalMap.merge(key,value,(oldValue,newValue)->oldValue + newValue));
        System.out.println(totalMap);
    }
}
