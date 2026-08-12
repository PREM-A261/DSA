import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for(int i=0;i< nums.length;i++){
            if(visited.contains(nums[i])){
                return true;
            }
            visited.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Contains_Duplicate obj = new Contains_Duplicate();
        int[] nums = {1,2,3,1};
        System.out.println("Contains duplicate: " + obj.containsDuplicate(nums));
    }
}
