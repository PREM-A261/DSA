package DAY2;
import java.util.*;
public class day2 {
    // public static void main(String[] args) {
    //     Set<Integer> set = new HashSet<>();
    //     int[] arr = {1, 2, 3, 4, 5, 2, 3, 4};

    //     for(int val : arr) {
    //         set.add(val);
    //     }

    //     Iterator it = set.iterator();

    //     while (it.hasNext()) {
    //         System.out.println(it.next() + " ");
    //     }

    // }






    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Prem", 89);
        map.put("Rahul", 90);
        map.put("Rohan", 91);

        System.out.println(map);

        // System.out.println(map.containsKey("Prem"));
        // System.out.println(map.containsValue(90));

        // System.out.println(map.get("Prem")); //89
        // System.out.println(map.get("Rohini")); //null

        // System.out.println(map.putIfAbsent("Pratik" ,56));

        // System.out.println(map.remove("Prem"));


        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry + ", ");
        }
    }
};

