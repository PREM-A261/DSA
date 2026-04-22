package DAY3;
import java.util.*;
public class Kth_largest_element {
    public static void main(String[] args) {
        PriorityQueue<Integer> pdq = new PriorityQueue<>();
        int[] arr = {5, 1, 10, 3, 12, 2, 8};
        int k = 3;

        for(int val:arr){
            pdq.offer(val);

            if(pdq.size()>k){
                pdq.poll();
            }
        }
        System.out.println(pdq);
    }
}

