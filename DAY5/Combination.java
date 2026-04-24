package DAY5;

public class Combination {
    public static int fact( int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n* fact(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int r=  3;
        int numerator = fact(n);
        int denomenator = fact(n-r);
        int R = fact(r);
        System.out.println(numerator/(denomenator*R));
    }
}
