public class Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        // ListNode temp = new ListNode(0);
        // ListNode currNode = head;
        if(head == null){
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;

        // while (currNode.next != null){
        //     if(currNode.next.val == val){
        //         currNode.next = currNode.next.next; 
        //     }
        //     else{
        //         currNode = currNode.next;
        //     }
        // }
        // return temp.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        Remove_Linked_List_Elements solution = new Remove_Linked_List_Elements();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(6);
        head.next.next.next = solution.new ListNode(3);
        head.next.next.next.next = solution.new ListNode(4);
        head.next.next.next.next.next = solution.new ListNode(5);
        head.next.next.next.next.next.next = solution.new ListNode(6);

        int val = 6;
        ListNode result = solution.removeElements(head, val);
        // Print the result or perform further operations
        // ...

        System.out.print("Output Linked List: ");
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
    }
}