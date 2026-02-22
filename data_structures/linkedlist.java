package data_structures;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();    
        /* Building linked list */
        ll.insertTail(0);
        ll.insertTail(1);
        ll.insertTail(2);
        ll.insertTail(3);
        ll.insertTail(4);
        ll.insertTail(5);
        ll.insertTail(6);
        ll.insertTail(7);
        ll.insertTail(8);
        ll.insertTail(9);
        ll.insertTail(10);
        System.out.println(ll);

        System.out.println(ll.getLength());
        ll.removeAt(0);
        System.out.println(ll);
        System.out.println(ll.getLength());
        ll.removeAt(9);
        System.out.println(ll);
        System.out.println(ll.getLength());
        ll.removeAt(4);
        System.out.println(ll);
    } 
}

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    /* Default constructor: sets attributes to null */
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    /* Optional constructor: Initialise linked list with a head node */
    public LinkedList(int val) {
        this.head = new ListNode(val);
        this.tail = this.head;
        this.length = 1;
    }

    /* public methods */

    /* Inserts a list node at the head */
    public void insertHead(int val) {
        ListNode node = new ListNode(val);
        if (this.isEmpty()) {
            this.head = node; 
            this.tail = node; 
            this.length++;
            return;
        }
        node.next = this.head;
        this.head = node;
        this.length++;
    }
    
    /* Inserts a list node at the tail */
    public void insertTail(int val) {
        ListNode node = new ListNode(val);
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node; 
            this.length++;
            return;
        }
        
        this.tail.next = node;
        this.tail = this.tail.next;
        this.length++;
    }

    /* Removes a specified element */
    public void remove(int val) {
        if (this.isEmpty()) {
            System.out.println("IsEmptyError: can't remove from empty list");
            return;
        }
        if (this.length == 1)
            this.head = null;

        ListNode curr, prev;
        curr = this.head;
        prev = curr;
        while (curr.next != null) {
            if (curr.val == val) {
                prev.next = curr.next.next;
            }  
            prev = curr;
            curr = curr.next;
        }
    }

    /* Removes list node at the head */
    public void removeHead() {
        if (this.isEmpty()) {
            System.out.println("IsEmptyError: can't remove from empty list");
            return;
        }

        this.head = this.head.next;
        this.length--;
    }

    /* Removes list node at the tail */
    public void removeTail() {
        if (this.isEmpty()) {
            System.out.println("IsEmptyError: can't remove from empty list");
            return;
        }
        if (this.length == 1) {
            this.head = null;
            this.length--;
            return;
        }

        ListNode curr;
        curr = this.head;
        while (curr.next != null) {
            if (curr.next == this.tail) {
                curr.next = null;
                this.tail = curr;
                this.length--;
                return;
            }
            curr = curr.next;
        }

        this.length--;
    }

    /* Removes a node at specified index */
    public void removeAt(int index) {
        if (this.isEmpty()) {
            System.out.println("IsEmptyError: can't remove from empty list");
            return;
        }
        if (index < 0 || index > this.length)
            System.out.println("IndexError: index out of bounds");
        if (index == 0) { 
            this.removeHead();
            return;
        }
        if (index == this.length - 1) {
            this.removeTail();
            return;
        }

        ListNode curr = this.head;
        int i = 0;
        while (i < index - 1 && curr.next != null) {
            curr = curr.next;
            i++;
        }
        curr = curr.next.next;
        this.length--;
    }

    /* Reverses the linked list */
    public void reverse() {}

    /* Prints the contents of the linked list */
    public String toString() {
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

    /* Returns the length of the linked list */
    public int getLength() { return this.length; };

    /* Returns true if at least one node exists */
    public boolean isEmpty() { return (this.head == null) ? true : false; }
}
