public class Split_Array_Largest_Sum {
    public static int countParts(int[] arr, int pages) {
        int students = 1;
        long pagesStudent = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {
                students += 1;
                pagesStudent = arr[i];
            }
        }
        return students;
    }

    public static int findPages(int[] arr, int n, int k) {
        if (k > n) {
            return -1;
        }

        int low = 0;
        int high = 0;
        for (int x : arr) {
            low = Math.max(low, x);
            high += x;
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countParts(arr, mid);

            if (students > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public int splitArray(int[] nums, int k) {
        return findPages(nums, nums.length, k);
    }
    public static void main(String[] args) {
        Split_Array_Largest_Sum obj = new Split_Array_Largest_Sum();
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.println(obj.splitArray(nums, k)); // Output: 18
    }
}
