package DAY3;
 import java.util.*;
public class Even_Odd {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>(Arrays.asList(45, 12, 23, 90));
        Comparator<Integer> cmp = (Integer a, Integer b) -> {
            if (a % 2 == 0) {
                return -1;
            }else {
                return 1;
            }
        };
        Collections.sort(arrList, cmp);
        System.out.println(arrList);
    }
}