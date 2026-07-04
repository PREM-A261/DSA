public class Valid_Number {
    public boolean isNumber(String s) {
        boolean isdot = false, ise = false, nums = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) nums = true;
            else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
            } 
            else if (c == 'e' || c == 'E') {
                if (ise || !nums) return false;
                ise = true;
                nums = false;
            } 
            else if (c == '.') {
                if (isdot || ise) return false;
                isdot = true;
            } 
            else return false;
        }
        return nums;
    }
    public static void main(String[] args) {
        Valid_Number validator = new Valid_Number();
        String input = "3.14e-2";
        boolean isValid = validator.isNumber(input);
        System.out.println(isValid);
    }
}
