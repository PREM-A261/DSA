public class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) 
            fast = fast.next;

        if (fast == null) 
            return head.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return head;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        Remove_Nth_Node_From_End_of_List removeNode = new Remove_Nth_Node_From_End_of_List();
        ListNode head = removeNode.new ListNode(1);
        head.next = removeNode.new ListNode(2);
        head.next.next = removeNode.new ListNode(3);
        head.next.next.next = removeNode.new ListNode(4);
        head.next.next.next.next = removeNode.new ListNode(5);

        int n = 2;
        head = removeNode.removeNthFromEnd(head, n);

        // Print the modified list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}