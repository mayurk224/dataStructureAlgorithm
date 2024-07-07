// 1. how to implement a circular singly linked list
// 2. how to traverse and print a circular singly linked list
// 3. how to insert node at the beginning of a circular singly linked list
// 4. how to insert node at the end of a circular singly linked list

public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private class ListNode{
        private  ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    // 1. how to implement a circular singly linked list
    public void createCircularLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    // 2. how to traverse and print a circular singly linked list
    public void display(){
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while(first != last){
            System.out.print(first.data+" ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    // 3. how to insert node at the beginning of a circular singly linked list
    public void insertFirst(int data){
        ListNode temp = new ListNode(data);
        if(last == null){
            last = temp;
        }
        else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    // 4. how to insert node at the end of a circular singly linked list
    public void insertLast(int data){
        ListNode temp = new ListNode(data);
        if(last == null){
            last = temp;
            last.next = last;
        }
        else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        // 1. how to implement a circular singly linked list
        csll.createCircularLinkedList();

        // 2. how to traverse and print a circular singly linked list
        csll.display();

        // 3. how to insert node at the beginning of a circular singly linked list
        csll.insertFirst(10);
        csll.display();

        // 4. how to insert node at the end of a circular singly linked list
        csll.insertLast(20);
        csll.display();
    }
}
