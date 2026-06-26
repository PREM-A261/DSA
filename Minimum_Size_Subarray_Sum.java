public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int minLen = Integer.MAX_VALUE;
        int curSum = 0;

        for(int right=0;right < nums.length;right++){
            curSum += nums[right];

            while (curSum >= target) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                }
                curSum -= nums[left];
                left++;
            }
        }
    
        return minLen != Integer.MAX_VALUE ? minLen : 0;    
    }
    public static void main(String[] args) {
        Minimum_Size_Subarray_Sum obj = new Minimum_Size_Subarray_Sum();
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int result = obj.minSubArrayLen(target, nums);
        System.out.println(result); 
    }
}
