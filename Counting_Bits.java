import java.util.Arrays;

public class Counting_Bits {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        Arrays.fill(ans,0);
        for(int i=1; i<=n;i++){
            if(i%2 == 0){
                ans[i] = ans[i/2];
            }
            else{
                ans[i] = ans[i/2]+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Counting_Bits cb = new Counting_Bits();
        int n = 5; // Example input
        int[] result = cb.countBits(n);
        System.out.println("Count of bits for numbers from 0 to " + n + ": " + Arrays.toString(result));
    }
}
