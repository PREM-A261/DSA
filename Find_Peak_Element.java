public class Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 0;
        }

        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        else if(nums[0]>nums[1]){
            return 0;
        }

        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid-1>=0 && mid+1<n && nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            }
            if(nums[mid]<nums[mid+1]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Find_Peak_Element obj = new Find_Peak_Element();
        int[] nums = {1,2,3,1};
        System.out.println("Peak element index: " + obj.findPeakElement(nums));
    }
}
