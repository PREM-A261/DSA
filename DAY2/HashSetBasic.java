package DAY2;

import java.util.*;
public class HashSetBasic {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(43);
        set.add(51);
        set.add(12);
        set.add(99);
        set.add(51);
        System.out.println(set);
        System.out.println(set.contains(51));
        System.out.println(set.contains(434));
        set.remove(51);
        System.out.println(set);
    }
};

