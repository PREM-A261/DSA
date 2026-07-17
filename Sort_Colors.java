public class Sort_Colors {
     public void sortColors(int[] nums) {
        int n=nums.length;
        int left=0,mid=0,end=n-1;
        while(mid<=end){
            if(nums[mid]==0){
                int temp = nums[left]; 
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[mid]; 
                nums[mid] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        // Example usage:
        int[] nums = {2, 0, 2, 1, 1, 0};
        Sort_Colors solution = new Sort_Colors();
        solution.sortColors(nums);

        // Print the sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
