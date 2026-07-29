public class Number_of_1_Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while( n != 0){
            int temp = (n & n-1);
            n = temp;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Number_of_1_Bits numberOf1Bits = new Number_of_1_Bits();
        int n = 11; // Example input
        int result = numberOf1Bits.hammingWeight(n);
        System.out.println("The number of 1 bits in " + n + " is: " + result);
    }
}
