public class Climbing_Stairs {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int one = 1;
        int two = 2;
        for(int i=3;i<=n;i++){
            int total = one + two;
            one = two;
            two = total;
        }
        return two;
    }
    public static void main(String[] args) {
        Climbing_Stairs cs = new Climbing_Stairs();
        int n = 5; // Example input
        int result = cs.climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
}
