public class Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        if(nums.length == 0){
            return 0;
        }   

        int min = nums[0];
        int max = nums[0];
        int ans = max;

        for(int i=1;i<nums.length;i++){
            int temp = Math.max(nums[i], Math.max(nums[i]*min , nums[i]*max));
            min = Math.min(nums[i], Math.min(nums[i]*min, nums[i]*max));
            max = temp;

            ans = Math.max(ans, max);
        }   
        return ans;
    }
    public static void main(String[] args) {
        Maximum_Product_Subarray mps = new Maximum_Product_Subarray();
        int[] nums = {2, 3, -2, 4}; // Example input
        int result = mps.maxProduct(nums);
        System.out.println("Maximum product of subarray: " + result);
    }
}
