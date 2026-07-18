public class Reorder_List {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;

        //mid
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //split
        ListNode second = slow.next;
        slow.next = null;

        //reverse ll
        ListNode prev= null;

        while( second != null ){
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second= next;
        }
        second = prev;

        // Merge 
        ListNode first = head;

        while( second != null){
            ListNode temp1= first.next;
            ListNode temp2= second.next;

            first.next=second;
            second.next=temp1;

            first = temp1;
            second = temp2; 
        }

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        Reorder_List reorderList = new Reorder_List();
        ListNode head = reorderList.new ListNode(1);
        head.next = reorderList.new ListNode(2);
        head.next.next = reorderList.new ListNode(3);
        head.next.next.next = reorderList.new ListNode(4);
        head.next.next.next.next = reorderList.new ListNode(5);

        reorderList.reorderList(head);

        // Print the reordered list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
