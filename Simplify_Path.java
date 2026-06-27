import java.util.Stack;

public class Simplify_Path {
    public String simplifyPath(String path) {
        String[] components = path.split("/");
        Stack<String> st = new Stack<>();

        for (String comp : components) {
            if (comp.equals("") || comp.equals(".")) {
                continue;
            }

            if (comp.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(comp);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }

        return sb.length() == 0 ? "/" : sb.toString();        
    }
    public static void main(String[] args) {
        Simplify_Path sp = new Simplify_Path();
        System.out.println(sp.simplifyPath("/adfghjk/./b/./../c/")); 
    }
}
