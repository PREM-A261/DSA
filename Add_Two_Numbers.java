public class Add_Two_Numbers {
     // 1. Find the lengths of l1 and l2
   private int getLength(ListNode head) {
        int len = 0;
        for (ListNode curr = head; curr != null; curr = curr.next) len++;
        return len;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1 ,q = l2 ,last = l1;
        
        // 2. Ensure l1 is the longest
        if (getLength(l2) > getLength(l1)) return addTwoNumbers(l2, l1);
        
        int carry = 0;
        
        // 3. Add the overlapping parts
       while (p != null) {
            int sum = p.val + (q != null ? q.val : 0) + carry;
            p.val = sum % 10;
            carry = sum / 10;
            
            last = p; // Track the absolute last node to avoid re-traversing
            p = p.next;
            if (q != null) q = q.next;
        }
        
        // 5. Handle the final carry
        if (carry > 0) last.next = new ListNode(carry);
      
        return l1;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        // Example usage:
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Add_Two_Numbers solution = new Add_Two_Numbers();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
