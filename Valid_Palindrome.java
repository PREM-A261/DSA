public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0, j= s.length() - 1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Valid_Palindrome obj = new Valid_Palindrome();
        String s = "A man, a plan, a canal: Panama";
        boolean result = obj.isPalindrome(s);
        System.out.println(result); // Output: true
    }
}
