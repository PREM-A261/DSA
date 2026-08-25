import java.util.HashSet;
import java.util.Set;

public class Smallest_Missing_Multiple_of_K {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int ans = k;

        while (set.contains(ans)) {
            ans += k;
        }

        return ans;
    }
    public static void main(String[] args) {
        Smallest_Missing_Multiple_of_K solution = new Smallest_Missing_Multiple_of_K();
        int[] nums = {3, 6, 9, 12};
        int k = 3;
        int result = solution.missingMultiple(nums, k);
        System.out.println("The smallest missing multiple of " + k + " is: " + result);
    }
}
