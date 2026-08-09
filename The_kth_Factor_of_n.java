public class The_kth_Factor_of_n {
    public int kthFactor(int n, int k) {
        int count = 0;
        for(int i=1; i<=n/2; i++){
            if(n%i == 0) count++;
            if(k == count) return i;
        }
        count++;
        if(count == k) return n;
        return -1;
    }
    public static void main(String[] args) {
        The_kth_Factor_of_n solution = new The_kth_Factor_of_n();
        int n = 12;
        int k = 3;
        int result = solution.kthFactor(n, k);
        System.out.println("The " + k + "-th factor of " + n + " is: " + result);
    }
}
