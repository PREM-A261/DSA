public class Removing_Stars_From_a_String {
     public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                sb.deleteCharAt(sb.length() - 1); 
            } else {
                sb.append(ch); 
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Removing_Stars_From_a_String obj = new Removing_Stars_From_a_String();
        String s = "leet**cod*e";
        String result = obj.removeStars(s);
        System.out.println(result); 
    }
}
