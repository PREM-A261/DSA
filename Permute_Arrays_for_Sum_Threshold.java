import java.util.Arrays;

public class Permute_Arrays_for_Sum_Threshold {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int size1 = arr1.length;
        int size2 = arr2.length;
        int start =0, end = size2-1;

        while(start<end){
            int temp = arr2[start];
            arr2[start] = arr2[end];
            arr2[end]= temp;
            start++;
            end--;

        }

        // if(size1==size2){
            for(int i=0; i<size1; i++){
                if(arr1[i]+arr2[i] < k){
                    return false;
                }
            }

        // }

        return true;
    }
    public static void main(String[] args) {
        Permute_Arrays_for_Sum_Threshold solver = new Permute_Arrays_for_Sum_Threshold();
        
        int k1 = 10;
        int[] arr1 = {2, 1, 3};
        int[] arr2 = {7, 8, 9};
        
        System.out.println("Is possible? " + solver.isPossible(k1, arr1, arr2)); // Expected: true
    }
}
