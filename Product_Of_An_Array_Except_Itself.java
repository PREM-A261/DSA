import java.util.Arrays;

public class Product_Of_An_Array_Except_Itself {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1 ;
        int post = 1;

        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        for(int i=0; i< nums.length; i++){
            ans[i] = pre;
            pre = pre * nums[i];
        }

        for(int i =nums.length -1; i>= 0; i--){
            ans[i] = ans[i] * post;
            post = post * nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Product_Of_An_Array_Except_Itself solution = new Product_Of_An_Array_Except_Itself();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        System.out.println("Product of Array Except Itself: " + Arrays.toString(result));
    }
}
