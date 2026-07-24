public class Sort_List {
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode mergeNode = new ListNode(-1);
        ListNode temp = mergeNode;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeNode.next;
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode midNode = getMid(head);
        ListNode rightHead = midNode.next;
        midNode.next = null;
        ListNode lefthalf = sortList(head);
        ListNode righthalf = sortList(rightHead);

        return merge(lefthalf, righthalf);
    }
    public ListNode sortList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode midNode = getMid(head);
        ListNode rightHead = midNode.next;
        midNode.next = null;
        ListNode lefthalf = sortList1(head);
        ListNode righthalf = sortList1(rightHead);

        return merge(lefthalf, righthalf);
    }
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Sort_List sortList = new Sort_List();
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        ListNode sortedHead = sortList.sortList(head);

        // Print the sorted linked list
        while (sortedHead != null) {
            System.out.print(sortedHead.val + " ");
            sortedHead = sortedHead.next;
        }
    }
}
