public class Rotate_Array {
    public void rotate(int[] nums, int k) {
    
    k%=nums.length;
    if(k<0)
    {
        k+=nums.length;
    }
    reverse(nums,0,nums.length-1);
    reverse(nums,0,k-1);
    reverse(nums,k,nums.length-1);
    }
    
    private void reverse(int nums[] , int left , int right)
    {
        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Rotate_Array rotateArray = new Rotate_Array();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray.rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
