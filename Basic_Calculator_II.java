public class Basic_Calculator_II {
    public int calculate(String s) {

        int num = 0;
        int result = 0;
        int lastNum = 0;
        char sign = '+';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

          if(Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {

                if (sign == '+') {
                    result += lastNum;
                    lastNum = num;
                } 
                else if (sign == '-') {
                    result += lastNum;
                    lastNum = -num;
                } 
                else if (sign == '*') {
                    lastNum = lastNum * num;
                } 
                else if (sign == '/') {
                    lastNum = lastNum / num;
                }

                sign = ch;
                num = 0;
            }
        }
        System.gc();
        return result + lastNum;
    }
    public static void main(String[] args) {
        Basic_Calculator_II calculator = new Basic_Calculator_II();
        String expression = "3+2*2";
        int result = calculator.calculate(expression);
        System.out.println("Result: " + result);
    }   
}
