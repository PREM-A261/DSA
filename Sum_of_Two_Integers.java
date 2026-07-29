public class Sum_of_Two_Integers {
    public int getSum(int a, int b) {
        while(b != 0){
            int temp = a^b;
            int carry = (a&b)<<1;
            a = temp;
            b = carry;
        }
        return a;
    }
    public static void main(String[] args) {
        Sum_of_Two_Integers sum = new Sum_of_Two_Integers();
        int a = 5;
        int b = 3;
        int result = sum.getSum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }
}
