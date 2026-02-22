
class LinearQueue {
    private char q[];
    private int put, get;

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

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i <= put; i++) {
            if (i == put)
                out += q[i];
            else {
                out += (q[i] + " -> ");
            }
        }
        return out;
    }

    private boolean isEmpty() { return (get == put)? true : false; }
    private boolean isFull() { return (put == q.length)? true : false; }
}


public class queue {
    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(10);
        q.enqueue('a');
        q.enqueue('b');
        q.enqueue('c');
        System.out.println(q);
    }
}