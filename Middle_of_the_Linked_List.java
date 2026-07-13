public class Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        Middle_of_the_Linked_List solution = new Middle_of_the_Linked_List();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        // Find the middle node
        ListNode middle = solution.middleNode(head);
        System.out.println("Middle node value: " + middle.val); // Output: 3
    }
}