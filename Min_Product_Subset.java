public class Min_Product_Subset {
    public int minProd(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            return arr[0];
        }

        int maxNeg = Integer.MIN_VALUE;
        int minPos = Integer.MAX_VALUE;
        int countNeg = 0;
        int countZero = 0;
        int prod = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countZero++;
                continue;
            }

            if (arr[i] < 0) {
                countNeg++;
                maxNeg = Math.max(maxNeg, arr[i]);
            } else {
                minPos = Math.min(minPos, arr[i]);
            }

            prod *= arr[i];
        }

        if (countNeg == 0) {
            if (countZero > 0) {
                return 0;
            }
            return minPos;
        }

        if (countNeg % 2 == 0) {
            prod = prod / maxNeg;
        }

        return prod;
    }
    public static void main(String[] args) {
        Min_Product_Subset minProductSubset = new Min_Product_Subset();
        int[] arr1 = { -1, -1, -2, 4, 3 };
        System.out.println(minProductSubset.minProd(arr1)); // Output: -24
    }
}
