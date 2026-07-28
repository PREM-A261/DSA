public class Count_Numbers_With_Unique_Digits {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0)     
            return 1;
        
        int res = 10;
        int uniqueDigits = 9;
        int availableNumber = 9;
        while (n-- > 1 && availableNumber > 0) {
            uniqueDigits = uniqueDigits * availableNumber;
            res += uniqueDigits;
            availableNumber--;
        }
        return res;
    }
    public static void main(String[] args) {
        Count_Numbers_With_Unique_Digits solution = new Count_Numbers_With_Unique_Digits();
        int n = 3; // Example input
        int result = solution.countNumbersWithUniqueDigits(n);
        System.out.println("Count of numbers with unique digits for n = " + n + " is: " + result);
    }
}
