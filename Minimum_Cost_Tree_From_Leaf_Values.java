import java.util.Stack;

public class Minimum_Cost_Tree_From_Leaf_Values {
        public int mctFromLeafValues(int[] arr) {
        Stack<Integer> s = new Stack<>();
        s.push(Integer.MAX_VALUE);
        int ans = 0;
        for(int nums:arr){
            while(s.peek()<=nums){
                int top = s.pop();
                ans += top * Math.min(s.peek(),nums);
            }
            s.push(nums);
        }
        while(s.size()>2){
            ans += s.pop() * s.peek();
        }
        return ans;
    }
    public static void main(String[] args) {
        Minimum_Cost_Tree_From_Leaf_Values solution = new Minimum_Cost_Tree_From_Leaf_Values();
        int[] arr = {6, 2, 4};
        int result = solution.mctFromLeafValues(arr);
        System.out.println("Minimum Cost Tree From Leaf Values: " + result);
    }
}
