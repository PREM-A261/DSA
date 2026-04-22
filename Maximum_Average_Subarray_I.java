package DAY3;

public class Maximum_Average_Subarray_I {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i];
            currentSum -= arr[i - k];

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println((double) maxSum / k);

    }
}
