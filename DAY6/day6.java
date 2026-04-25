package DAY6;

// ! Single Linked List.
// public class day6 {
    // Node head;
    // int size;
    // class Node {
    //     int val;
    //     Node next = null;
    //     Node(int value) {
    //         this.val = value;
    //     }
    // }
    // public void prepend(int val) {
    //     Node newNode = new Node(val);
    //     size++;
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }
    //     newNode.next = head;
    //     head = newNode;
    // }
    // public void append(int val) {
    //     Node newNode = new Node(val);
    //     size++;
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }
    //     Node currentNode = head;
    //     while (currentNode.next != null) {
    //         currentNode = currentNode.next;
    //     }
    //     currentNode.next = newNode;
    // }
    // public void deleteStart() {
    //     if (head == null) {
    //         System.out.println("List is Empty!!!");
    //         return;
    //     }
    //     head = head.next;
    //     size--;
    // }
    // public void deleteEnd() {
    //     if (head == null) {
    //         System.out.println("List is Empty");
    //         return;
    //     }
    //     size--;
    //     if (head.next == null) {
    //         head = null;
    //         return;
    //     }
    //     Node currentNode = head;
    //     while (currentNode.next.next != null) {
    //         currentNode = currentNode.next;
    //     }
    //     currentNode.next = null;
    // }
    // public int size() {
    //     return size;
    // }
    // public void printList() {
    //     Node currentNode = head;
    //     while (currentNode != null) {
    //         System.out.print(currentNode.val + " -> ");
    //         currentNode = currentNode.next;
    //     }
    //     System.out.println("null");
    // }
    // public static void main(String[] args) {
    //     day6 list = new day6();
    //     list.prepend(1);
    //     System.out.println("Size of LL = " + list.size());
    //     list.append(3000);
    //     list.append(2000);
    //     list.printList();
    //     list.deleteStart();
    //     list.append(1000);
    //     list.prepend(5000);
    //     list.printList();
    //     list.deleteEnd();
    //     list.printList();
    //     System.out.println("Size of LL = " + list.size());
        
    // }



    //public static void main(String[] args) {
    // ! Doubly Linked List.
    // Node head;
    // Node tail;
    // int size;
    // class Node {
    //     int val;
    //     Node next = null;
    //     Node prev = null;
    //     Node(int value) {
    //         this.val = value;
    //     }
    // }
    // public void prepend(int val) {
    //     Node newNode = new Node(val);
    //     size++;
    //     if (head == null) {
    //         head = newNode;
    //         tail = newNode;
    //         return;
    //     }
    //     head.prev = newNode;
    //     newNode.next = head;
    //     head = newNode;
    // }
    // public void append(int val) {
    //     Node newNode = new Node(val);
    //     size++;
    //     if (head == null) {
    //         head = newNode;
    //         tail = newNode;
    //         return;
    //     }
    //     tail.next = newNode;
    //     newNode.prev = tail;
    //     tail = newNode;
    // }
    // public void deleteStart() {
    //     if (head == null) {
    //         System.out.println("List is Empty!!!");
    //         return;
    //     }
    //     if (head.next == null) {
    //         head = null;
    //         tail = null;
    //         return;
    //     }
    //     head = head.next;
    //     head.prev = null;
    //     size--;
    // }
    // public void deleteEnd() {
    //     // LL has 0 Nodes
    //     if (head == null) {
    //         System.out.println("List is Empty!!!");
    //         return;
    //     }
    //     size--;
    //     // LL has 1 Node
    //     if (head.next == null) {
    //         head = null;
    //         tail = null;
    //         return;
    //     }
    //     // LL has more than 1 Nodes
    //     tail = tail.prev;
    //     tail.next = null;
    // }
    // public int size() {
    //     return size;
    // }
    // public void reverseList() {
    //     Node currentNode = tail;
    //     while (currentNode != null) {
    //         System.out.print(currentNode.val + " <-> ");
    //         currentNode = currentNode.prev;
    //     }
    //     System.out.println("null");
    // }
    // public void printList() {
    //     Node currentNode = head;
    //     while (currentNode != null) {
    //         System.out.print(currentNode.val + " <-> ");
    //         currentNode = currentNode.next;
    //     }
    //     System.out.println("null");
    // }
    // public static void main(String[] args) {
    //     day6 list = new day6();
    //     list.prepend(1);
    //     list.append(100);
    //     list.prepend(1);
    //     // System.out.println("Size of LL = " + list.size());
    //     list.append(20);
    //     list.append(2000);
    //     list.printList();
    //     list.deleteStart();
    //     // list.append(100);
    //     list.printList();
    //     list.deleteEnd();
    //     list.printList();
    //     System.out.println("--------------------");
    //     list.reverseList();
    //     // System.out.println("Size of LL = " + list.size());
    // }
// }
// }


// ! Circular Doubly Linked List.
public class day6 {

    Node head;
    Node tail;
    int size;

    class Node {

        int val;
        Node next = null;
        Node prev = null;

        Node(int value) {
            this.val = value;
        }
    }

    public void prepend(int val) {
        Node newNode = new Node(val);
        size++;

        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        newNode.next = head;
        newNode.prev = tail;

        head.prev = newNode;
        tail.next = newNode;

        head = newNode;
    }

    public void append(int val) {
        Node newNode = new Node(val);
        size++;

        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        newNode.prev = tail;
        newNode.next = head;

        tail.next = newNode;
        head.prev = newNode;

        tail = newNode;
    }

    public void deleteStart() {
        if (head == null) {
            System.out.println("List is Empty!!!");
            return;
        }

        size--;

        // Only one node
        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = tail;
        tail.next = head;
    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is Empty!!!");
            return;
        }

        size--;

        // Only one node
        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
    }

    public int size() {
        return size;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty!!!");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.val + " <-> ");
            current = current.next;
        } while (current != head);

        System.out.println("(back to head)");
    }

    public void reverseList() {
        if (tail == null) {
            return;
        }

        Node current = tail;

        do {
            System.out.print(current.val + " <-> ");
            current = current.prev;
        } while (current != tail);

        System.out.println("(back to tail)");
    }

    public static void main(String[] args) {
        day6 list = new day6();

        list.prepend(1);
        list.append(100);
        list.prepend(1);
        list.append(20);
        list.append(2000);

        list.printList();

        list.deleteStart();
        list.printList();

        list.deleteEnd();
        list.printList();

        System.out.println("--------------------");
        list.reverseList();
    }
}