public class Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null)
            return null;
        ListNode a = headA;
        ListNode b = headB;
        
        while( a != b){
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Intersection_of_Two_Linked_Lists intersectionFinder = new Intersection_of_Two_Linked_Lists();

        // Creating List A: 4 -> 1 -> 8 -> 4 -> 5 -> null
        ListNode listA = intersectionFinder.new ListNode(4, intersectionFinder.new ListNode(1, intersectionFinder.new ListNode(8, intersectionFinder.new ListNode(4, intersectionFinder.new ListNode(5)))));

        // Creating List B: 5 -> 0 -> 1 -> 8 -> 4 -> 5 -> null
        ListNode listB = intersectionFinder.new ListNode(5, intersectionFinder.new ListNode(0, intersectionFinder.new ListNode(1, listA.next.next))); // Pointing to the same node as in listA

        System.out.print("List A: ");
        printList(listA);
        System.out.print("List B: ");
        printList(listB);

        ListNode intersectionNode = intersectionFinder.getIntersectionNode(listA, listB);

        if (intersectionNode != null) {
            System.out.println("Intersection Node Value: " + intersectionNode.val);
        } else {
            System.out.println("No Intersection Found.");
        }
    }
}
