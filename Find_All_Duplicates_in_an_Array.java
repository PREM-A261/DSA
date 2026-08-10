import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i< nums.length;i++){
            int idx = Math.abs(nums[i]);
            if(nums[idx -1] < 0){
                ans.add(idx);
            }
            nums[idx -1] *= -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Find_All_Duplicates_in_an_Array obj = new Find_All_Duplicates_in_an_Array();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> duplicates = obj.findDuplicates(nums);
        System.out.println(duplicates); // Output: [2, 3]
    }
}
