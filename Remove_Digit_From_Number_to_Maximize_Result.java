public class Remove_Digit_From_Number_to_Maximize_Result {
    public String removeDigit(String number, char digit) {
        String result= "";
        for(int i=0;i<number.length();i++) {
            if(number.charAt(i)==digit){
                String newNum=number.substring(0,i)+number.substring(i+1);
                if(newNum.compareTo(result)>0){
                    result=newNum;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Remove_Digit_From_Number_to_Maximize_Result obj = new Remove_Digit_From_Number_to_Maximize_Result();
        String number = "1231";
        char digit = '1';
        String result = obj.removeDigit(number, digit);
        System.out.println("Result after removing digit: " + result);
    }
}