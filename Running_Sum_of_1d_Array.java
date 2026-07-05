public class Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        int prev = 0;
        for(int i=0;i<nums.length;i++){
            nums[i]=prev + nums[i];
            prev = nums[i];
        }
        return nums;
    }
    /*
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
    */
   public static void main(String[] args) {
        Running_Sum_of_1d_Array rs = new Running_Sum_of_1d_Array();
        int[] nums = {1, 2, 3, 4};
        int[] result = rs.runningSum(nums);
        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
