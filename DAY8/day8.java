package DAY8;

public class day8 {
    // Node head;

    // class Node {
    //     int data;
    //     Node next;

    //     Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }

    // }
    // public boolean isEmpty() {
    //     return head == null;
    // }
    
    // public void append(int data) {
    //     Node newNode = new Node(data);
    //     if(head == null) {
    //         head = newNode;
    //         return;
    //     }
    //     Node current = head;
    //     while(current.next != null) {
    //         current = current.next;
    //     }
    //     current.next = newNode;
    // }

    // public void remove(int data) {
    //     if(head == null) {
    //         System.out.println("Queue is empty");
    //         return;
    //     }
    //     if(head.data == data) {
    //         head = null;
    //         return;
    //     }
    //     head = head.next;
    // }

    // public int peek() {
    //     if(head == null) {
    //         System.out.println("Queue is empty");
    //         return -1;
    //     }
    //     return head.data;
    // }
    // public static void main(String[] args) {
    //     day8 queue = new day8();
    //     queue.append(10);
    //     queue.append(20);
    //     queue.append(30);
    //     queue.append(40);
    //     queue.remove(20);
    //     System.out.println(queue.peek());
    //     System.out.println(queue.isEmpty());
    // }






    // using ArratList

    // public void append(int data) {
    //     ArrayList<Integer> queue = new ArrayList<>();
    //     queue.add(data);
    // }
    // public static void main(String[] args) {
        
    // }

    //using Array
    // int[] arr;
    // int size;

    // public day8(int size) {
    //     this.size = size;
    //     this.arr = new int[size];
    // }
    
    // public boolean isEmpty() {
    //     return size == 0;
    // }

    // public void append(int data) {
    //     if (size == arr.length) {
    //         System.out.println("Queue is full");
    //         return;
    //     }
    //     arr[size++] = data;
    // }

    // public int remove() {
    //     if (isEmpty()) {
    //         System.out.println("Queue is empty");
    //         return -1;
    //     }
    //     int removed = arr[0];
    //     for (int i = 0; i < size - 1; i++) {
    //         arr[i] = arr[i + 1];
    //     }
    //     size--;
    //     return removed;
    // }
    
    // public static void main(String[] args) {
    //     day8 queue = new day8(5);
    //     queue.append(1);
    //     queue.append(2);    
    //     queue.append(3);
    //     queue.append(4);
    //     queue.append(5);
    //     System.out.println(queue.remove());
    //     System.out.println(queue.remove());

    // }


    //Circular Queue using Array
    int[] arr;
    int front;
    int rear;
    int size;

    public day8(int capacity) {
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void append(int data) {
        if (size == arr.length) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = data;
        size++;
    }

    public void remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        front = (front + 1) % arr.length;
        size--;
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        day8 queue = new day8(5);
        queue.append(1);
        queue.append(2);    
        queue.append(3);
        queue.append(4);
        queue.append(5);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.peek());
    }

    // implementing queue using stack
    // implementing stack using queue

}
