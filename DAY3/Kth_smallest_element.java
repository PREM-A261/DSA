package DAY3;

import java.util.Comparator;
import java.util.PriorityQueue;
public class Kth_smallest_element {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int[] arr = {5, 1, 10, 3, 12, 2, 8};
        int k = 3;

        for(int val: arr) {

            pq.offer(val);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println(pq);
    }
}
