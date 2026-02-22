package classes;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        int count;
        FinalizationDemo obj = new FinalizationDemo(0);

        /* Generate large number of objects to force garbage collection */
        for (count = 1; count < 100000; count++)
            obj.generator(count);
    }    
}

class FinalizationDemo {
    int x;

    FinalizationDemo(int num) {
        x = num;
    }

    /* Called when an object is recycled */
    protected void finalize() {
        System.out.println("Finalizing: " + x);
    }

    /* Generates an object that is immediately destryoed */
    void generator(int i) {
        FinalizationDemo o = new FinalizationDemo(i); 
    }
}
