package learning.LearnHashMap;

import java.util.HashMap;

public class BasicOperation {
    public static void main(String arg[]) {

        System.out.println("===== Basic Operation ====");

        // create - O(1)
        HashMap<String, Integer> hm = new HashMap<>();

        // insert - O(1)
        hm.put("India", 100);
        hm.put("China", 200);
        hm.put("Canada", 300);

        System.out.println(hm);

        // get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        // ContainKey - O(1)
        System.out.println(hm.containsKey("India"));

        System.out.println(hm.containsValue(1000));

        // remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // clear
        hm.clear();

        // check empty or not
        System.out.println(hm.isEmpty());

    }
}