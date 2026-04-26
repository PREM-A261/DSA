package DAY7;

import java.util.Stack;

public class day7 {
    Stack<Integer> stack = new Stack<>();

    //peek 
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty!!!");
            return -1;
        }
        return stack.peek();
    }
    public void push(int val) {
        stack.push(val);
    }

    //pop
    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty!!!");
            return;
        }
        stack.pop();
    }

    //isEmpty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        day7 st = new day7();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}
