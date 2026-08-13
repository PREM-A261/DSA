public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        if(nums[0] == target){
            return 0;
        }

        int left = 0;
        int right = nums.length-1;

        while(left<= right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[left]<=nums[mid]){
                if(nums[left]<= target && nums[mid]> target){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(nums[mid]< target && target <= nums[right]){
                    left = mid+1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Search_in_Rotated_Sorted_Array obj = new Search_in_Rotated_Sorted_Array();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = obj.search(nums, target);
        System.out.println("Index of target " + target + " is: " + result);
    }
}
