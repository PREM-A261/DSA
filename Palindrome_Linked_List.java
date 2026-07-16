public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }

        ListNode prev =null;

        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode left = head;
        ListNode right = prev;

        while( right != null) {
            if(right.val != left.val)
                return false;
            
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        Palindrome_Linked_List solution = new Palindrome_Linked_List();
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(2);
        head.next.next.next = solution.new ListNode(1);

        boolean result = solution.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);
    }
}
