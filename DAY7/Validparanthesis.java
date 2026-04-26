package DAY7;
import java.util.*;

public class Validparanthesis {
   public static boolean isValid (String str) {
    if(str.length()%2 == 1 || str.length() == 0){
        return false;
    }

    Stack<Character> stack = new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch=='(' || ch=='{' || ch=='['){
            stack.push(ch);
        }else{
            if(stack.isEmpty()){
                return false;
            }
            char top = stack.peek();
            if((ch==')' && top=='(') || (ch=='}' && top=='{') || (ch==']' && top=='[')){
                stack.pop();
            } else{
                return false;
            }
        }
    }
    return stack.isEmpty();
   }
    public static void main(String[] args) {
        String str = "()){}[]";
        System.out.println("String is "+ isValid(str));
    }
}
