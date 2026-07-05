public class Shifting_Letters {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder ans = new StringBuilder(s);
        long shift=0;
        for (int i = s.length()-1; i >=0 ; i--){
            ans.setCharAt(i, (char)((s.charAt(i) - 'a' + (shift+shifts[i]) % 26) % 26 + 'a'));
            shift+=shifts[i];
        }
        return ans.toString();
    }
    /*
    Input: s = "abc", shifts = [3,5,9]
    Output: "rpl"
    Explanation: We start with "abc".
    After shifting the first 1 letters of s by 3, we have "dbc".
    After shifting the first 2 letters of s by 5, we have "igc".
    After shifting the first 3 letters of s by 9, we have "rpl", the answer.
    */
    public static void main(String[] args) {
        Shifting_Letters sl = new Shifting_Letters();
        String s = "abc";
        int[] shifts = {3, 5, 9};
        String result = sl.shiftingLetters(s, shifts);
        System.out.println("Result: " + result);
    }
}
