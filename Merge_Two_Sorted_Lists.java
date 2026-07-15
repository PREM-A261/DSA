public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return (list1 != null) ? list1 : list2;
        }

        if(list1.val > list2.val){
            ListNode temp = list1;
            list1 = list2;
            list2 =  temp;
        }

        list1.next = mergeTwoLists(list1.next,list2);

        return list1;
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
        Merge_Two_Sorted_Lists merger = new Merge_Two_Sorted_Lists();

        // Creating List 1: 1 -> 2 -> 4 -> null
        ListNode list1 = merger.new ListNode(1, merger.new ListNode(2, merger.new ListNode(4)));

        // Creating List 2: 1 -> 3 -> 4 -> null
        ListNode list2 = merger.new ListNode(1, merger.new ListNode(3, merger.new ListNode(4)));

        System.out.print("List 1: ");
        printList(list1);
        System.out.print("List 2: ");
        printList(list2);

        ListNode mergedList = merger.mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        printList(mergedList);
    }
}