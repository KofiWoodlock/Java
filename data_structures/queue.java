package data_structures;

public class queue {
    
}

class LinearQueue {
    char q[];
    int put, get;

    LinearQueue(int size) {
        q = new char[size];
        put = get = 0;
    }

    /* Adds an element to the end of the queue */
    public void enqueue(char c) {
        if (isFull())  {
            System.out.println("Error: queue is full");
            return;
        }
        q[put++] = c;
    }

    /* Removes an element from the front queue */
    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Error: queue is empty");
            return (char) 0;
        }
        return q[get++];
    }

    private boolean isEmpty() { return (get == put)? true : false; }
    private boolean isFull() { return (put == q.length)? true : false; }
}