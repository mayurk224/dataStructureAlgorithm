import java.util.Arrays;
import java.util.Comparator;

// 1. we connect singlyLinkedList Nodes with previous Node
// 2. we display linked Nodes in console
// 3. we will find the length of linkedList nodes
// 4. insert a node in the beginning of singly linked list nodes
// 5. insert a node at the end of the singly linked list nodes
// 6. insert a node at any given position in singly linked list node
// 7. delete first node from singly linked listed node
// 8. delete last node from singly linked list node
// 9. delete node from a given position in singly linked list node
// 10. search element in linked list
// 11. reverse singly linked list
// 12. find last nth node from singly linked list
// 13. remove duplicate node from sorted linked list
// 14. delete multiple element from singly linked list
// 15. add multiple element in singly linked list
// 16. insert node in sorted singly linked list
// 17. function to sort singly linked listed Nodes
public class singlyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 2. display LinkedListNode to console
    public void display() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null\n");
        System.out.println("Length of LinkedListNodes is " + count);
    }

    // 3. find length of LinkedListNode
    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // 4. insert a node in the beginning of the singly linked list node
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // 5. insert a node to the end of singly linked list node
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // 6. insert a node at any given position in singly linked list node
    public void insertAny(int data, int position) {
        ListNode node = new ListNode(data); // create a node with value and its next pointing to null
        if (position == 1) { // check whether the position is 1 or not
            node.next = head;
            head = node;
        } else {
            ListNode previous = head; // assigning head as previous
            int count = 1; // to keep on tracking we create count variable
            while (count < position - 1) { // if while loop comes to be true
                previous = previous.next; // assigning next value to the previous
                count++; // and increment count, & this will repeat until block comes to be false
            }
            ListNode current = previous.next; // after completing while block we assign prev.next value to new node named current
            node.next = current; // then assigning temp node next as current value
            previous.next = node; // then the node value will be assigned to prev.next
        }
    }

    // 7. delete first node from singly linked listed node
    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head; // assigning head position to the new listnode called temp
        head = head.next; // then assigning head position as head next
        temp.next = null; // so now we can assign temp position as null
        return temp;
    }

    // 8. delete last node from singly linked list node
    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            ListNode temp = head;
            head = null;
            return temp;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    // 9. delete node from a given position in singly linked list node
    public void deleteAny(int n) {
        if (n == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < n - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    // 10. search element in linked list
    public boolean search(int n) {
        ListNode current = head;
        while (current != null) {
            if (current.data == n) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 11. reverse singly linked list
    public ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.head = previous; // update the head reference after reversing
        return previous;
    }


    // 12. find last nth node from singly linked list
    public ListNode lastNthNode(int n){
        if(head == null){
            return null;
        }
        if(n<=0){
            throw new IllegalArgumentException("Invalid Value :"+n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while(count<n){
            if(refPtr == null){
                throw new IllegalArgumentException(n+" position is greater than node length");
            }
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }


    // 13. remove duplicate node from sorted linked list
    public void removeDuplicate(){
        ListNode current = head;
        while(current!=null && current.next !=null){
            if(current.data == current.next.data){
                current.next =  current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }


    // 14. delete multiple elements by their position from singly linked list
    public void deleteMultiplePositions(int[] positions) {
        // Sort the positions array in descending order
        Arrays.sort(positions);

        // Iterate from the end of the positions array
        for (int i = positions.length - 1; i >= 0; i--) {
            deleteAny(positions[i]);
        }
    }


    // 15. add multiple element in singly linked list
    public void insertMultiplePositions(int[] values, int[] positions) {
        if (values.length != positions.length) {
            throw new IllegalArgumentException("Values and positions arrays must have the same length");
        }

        // Find the length of the linked list
        int listLength = length();

        // Check if any position is greater than the length of the linked list
        for (int position : positions) {
            if (position > listLength + 1) {
                throw new IllegalArgumentException("Position " + position + " is greater than the length of the linked list");
            }
        }

        // Sort the positions array and values array together in ascending order
        Integer[] indices = new Integer[values.length];
        for (int i = 0; i < values.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, Comparator.comparingInt(i -> positions[i]));

        for (int i : indices) {
            insertAny(values[i], positions[i]);
        }
    }


    // 16. insert node in sorted singly linked list
    public ListNode insertInSort(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }


    // 17. function to sort singly linked listed Nodes
    // Method to sort the linked list
    public void sort() {
        head = mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = getMiddle(head);
        ListNode nextOfMiddle = middle.next;
        middle.next = null;

        ListNode left = mergeSort(head);
        ListNode right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    private ListNode sortedMerge(ListNode a, ListNode b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        ListNode result;
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    private ListNode getMiddle(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        singlyLinkedList sll = new singlyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // 1. connect singly linked listed nodes
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        // linked list node : 10-->1-->8-->11-->null
        sll.display();

        // insert value in the start of the node
        sll.insertFirst(15);
        // linked list node : 15-->10-->1-->8-->11-->null
        //                   <new><---original----->
        sll.display();

        // insert value in the last of the node
        sll.insertLast(40);
        sll.insertLast(35);
        // linked list node : 15-->10-->1-->8-->11-->40-->35-->null
        //                   <prev><---original------><--new--->
        sll.display();

        // insert value to any position in linked list node
        sll.insertAny(50, 3);
        // linked list node : 15-->10-->50-->1-->8-->11-->40-->35-->null
        //                    fI        Ia                lI   lI
        // fI - first insert, Ia - insert at any position, lI - last insert
        sll.display();

        // delete first node from singly linked list node
        System.out.println("Deleted first node: " + sll.deleteFirst().data);
        // linked list node : 15-->10-->50-->1-->8-->11-->40-->35-->null
        //                   del
        sll.display();

        // delete last node from singly linked list node
        System.out.println("Deleted last node: " + sll.deleteLast().data);
        // linked list node : 10-->50-->1-->8-->11-->40-->null
        //                                                del
        sll.display();

        // delete node from any position in singly linked list node
        sll.deleteAny(5); // if you insert position out of bound then it will give null pointer exception
        // linked list node : 10-->50-->1-->8-->40-->null
        //                                     del
        sll.display();

        // search element in singly linked list node
        // linked list node : 10-->50-->1-->8-->40-->null
        if (sll.search(1)) {
            System.out.println("Key present in singly linked list node");
        } else {
            System.out.println("Key absent in singly linked list node");
        }

        // reverse singly linked list node
        // linked list node : 10-->50-->1-->8-->40-->null
        // ans :              40-->8-->1-->50-->10-->null
        sll.reverse(sll.head);
        sll.display();


        // Find and print the last nth node
        // linked list node : 40-->8-->1-->50-->10-->null
        int n = 3; // Change this value to find a different nth node from the end
        ListNode nthNode = sll.lastNthNode(n);
        if (nthNode != null) {
            System.out.println("The " + n + "rd/th node from the end is: " + nthNode.data);
        } else {
            System.out.println("The linked list is shorter than " + n + " nodes.");
        }


        // remove duplicate elements from sorted singly linked list
        // current linked list : 40-->8-->1-->50-->10-->null
        int[] positions = {1,2,3,4,5};
        sll.deleteMultiplePositions(positions);
        sll.display(); // here linked list is empty null
        System.out.println("Remove duplicate element from sorted linked list");
        sll.insertLast(1);
        sll.insertLast(1);
        sll.insertLast(2);
        sll.insertLast(2);
        sll.insertLast(3);
        sll.insertLast(3);
        sll.insertLast(4);
        sll.removeDuplicate();
        sll.display();


        // 15. add multiple element in singly linked list
        // Insert multiple nodes at specified positions
        int[] values = {5, 6, 7};
        int[] pos = {2, 5, 1};  // Example positions to insert values
        sll.insertMultiplePositions(values, pos);

        // Display the linked list after insertion
        System.out.println("List after inserting values at positions " + Arrays.toString(positions) + ":");
        sll.display();


        // 16. insert node in sorted singly linked list
        sll.sort();
        sll.insertAny(9,8);
        sll.insertInSort(8);
        sll.display();
    }
}
