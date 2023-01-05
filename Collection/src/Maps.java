import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 3, "B", 5, "C", 10);

//        Map<String, Integer> hashmap = new HashMap<>(map);
//        hashmap.put("H", 8);
//        hashmap.put("A", 8);
//        System.out.println("Hashmap" + hashmap);
//
//        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(map);
//        linkedHashMap.put("H", 8);
//        linkedHashMap.put("A", 8);
//        System.out.println("Linkedhashmap" + linkedHashMap);

        TreeMap<String, Integer> treeMap = new TreeMap<>(map);
        treeMap.put("H", 8);
        treeMap.put("K", 2);
        treeMap.put("J", 4);
        System.out.println(treeMap);
        System.out.println(treeMap.subMap("B", "J"));

//        System.out.println(map.get("C"));
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.containsKey("C"));
//        System.out.println(map.containsValue(3));
    }
}
