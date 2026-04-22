package DAY3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_ {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>(Arrays.asList(43, 11, 56, 99, 20));

        Comparator<Integer> cmp = new Comparator<Integer>() {
        
            @Override
            public int compare(Integer a, Integer b) {
                if(a%10 > b%10)
                    return 1;
                else
                    return -1;
            }
        };

        // ! Lambda expression
        // Comparator<Integer> cmp1 = (Integer a, Integer b) -> {
        //     if(a%10 > b%10)
        //         return 1;
        //     else
        //         return -1;
        // };


        Collections.sort(arrList, cmp);
        System.out.println(arrList);



    }
}
