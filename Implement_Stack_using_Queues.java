import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queues {
    private Queue<Integer> q1;

    public Implement_Stack_using_Queues() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
        for(int i=0;i<q1.size() - 1;i++){
            q1.add(q1.poll());
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
    public static void main(String[] args) {
        Implement_Stack_using_Queues stack = new Implement_Stack_using_Queues();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());   // returns 2
        System.out.println(stack.pop());   // returns 2
        System.out.println(stack.empty()); // returns false
    }
}
