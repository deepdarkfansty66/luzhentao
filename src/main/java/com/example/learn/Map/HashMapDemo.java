package com.example.learn.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // HashMap是一个无序的集合，底层是一个哈希表
        // HashMap的key可以为null，value也可以为null
        // HashMap的key是无序的，key的存储是按照key的哈希值进行存储的
        // 如果key是自定义的类型，那么key所属的类必须重写hashCode和equals方法
        // 如果key是自定义的类型，而且key所属的类没有重写hashCode和equals方法，那么可以通过构造方法传入一个比较器
        // 如果key是自定义的类型，而且key所属的类重写了hashCode和equals方法，而且通过构造方法传入了一个比较器，那么优先使用比较器
        HashMap<String, String> map = new HashMap<>();
        String s1 = map.put("a", "a");
        String s2 = map.put("b", "b");
        String s3 = map.put("c", "c");
        String s4 = map.put("a", "d");
//        输出的值是被覆盖的值
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(map);
//      清空集合
//        map.clear();
//        判断集合是否为空
        boolean empty = map.isEmpty();
        System.out.println(empty);
//        判断map中是否包含某个key或者value
        System.out.println(map.containsKey("b"));
        System.out.println(map.containsValue("a"));
//        extracted(map);
//        extracted1(map);
        extracted2(map);
    }

    /**
     * 遍历map中的所有键值对
     * @param map
     */
    private static void extracted2(HashMap<String, String> map) {
        map.forEach((k, v) -> System.out.println(k + "----" + v));
    }

    /**
     * 遍历map中的所有键值对
     * @param map
     */
    private static void extracted1(HashMap<String, String> map) {
        //        获取map中的所有键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }
    }

    /**
     * 遍历map中的所有key或者value
     * @param map
     */
    private static void extracted(HashMap<String, String> map) {
        //        获取map中的所有key或者value
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(map.get(string));
        }
    }
}
