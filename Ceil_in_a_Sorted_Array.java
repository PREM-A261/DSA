public class Ceil_in_a_Sorted_Array {
    public int findCeil(int[] arr, int x) {
        int low = 0;
        int high = arr.length -1;
        int res = -1;
        
        while(low <= high){
            int mid = low+ (high -low)/2;
            
            if(arr[mid] < x){
                low = mid +1;
            }
            else{
                res = mid;
                high = mid -1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Ceil_in_a_Sorted_Array obj = new Ceil_in_a_Sorted_Array();
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        System.out.println(obj.findCeil(arr, x)); // Output: 2
    }
}
