package data_structures;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(5);    
        System.out.println(ll);
    } 
}

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
    private ListNode head;
    private int length;

    /* Default constructor: sets attributes to null */
    public LinkedList() {
        this.head = null;
        this.length = 0;
    }

    /* Optional constructor: Initialise linked list with a head node */
    public LinkedList(int val) {
        this.head = new ListNode(val, null);
        this.length = 1;
    }

    /* public methods */

    /* Inserts a list node at the head */
    public void insertHead(ListNode node) {
        if (this.isEmpty()) this.head = node; 
    }
    
    /* Inserts a list node at the tail */
    public void insertTail(ListNode node) {}

    /* Removes list node at the head */
    public void removeHead() {}

    /* Removes list node at the tail */
    public void removeTail() {}

    /* Removes a node at specified index */
    public void removeAt() {}

    /* Reverses the linked list */
    public void reverse() {}

    /* Prints the contents of the linked list */
    public String toString() {
        System.out.println("toString called!");
        String out = "";
        ListNode curr;

        if (isEmpty()) return out;
        curr = this.head;
        while (curr != null) {
            out += curr.val + "->";
            curr = curr.next;
        }
        return out;
    }

    /* private methods */

    /* Returns true if at least one node exists */
    private boolean isEmpty() { return (this.head == null) ? true : false; }

    /* Returns the length of the linked list */
    private int getLength() { return this.length; };


}
