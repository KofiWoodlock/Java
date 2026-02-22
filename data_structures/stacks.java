/* Stack (array implementation) */

class Stack {
    private int size;
    private int stack[];
    private int top = 0;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
    }

    public void push(int val) {
        stack[top++] = val;
        if (top >= size / 2)
            resize();
    }
    public int pop() throws IndexOutOfBoundsException {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
    }
    public int len() {
        return top + 1;
    }
    public String toString() {
        print();
        return "";
    }

    private boolean isEmpty() {
        return top <= 0;
    }
    private void resize() {
        int newStack[] = new int[(int) Math.pow(size, 2)]; 
        for (int i = 0; i < size; i++)
            newStack[i] = stack[i];
        size = newStack.length;
        stack = newStack;
    }

    private void print() {
        System.out.print("[");
        for (int i = 0; i < stack.length; i++) {
            if (i == stack.length-1)
                System.out.print(stack[i]);
            else {
                System.out.print(stack[i] + ", ");
            }
        }
        System.out.print("]");
    }
}

public class stacks {
    public static void main(String[] args) {
        Stack plates = new Stack(2);
        System.out.println(plates);
        plates.push(1);
        System.out.println(plates);
        plates.push(2);
        System.out.println(plates);
        plates.push(3);
        plates.push(4);
        plates.push(5);
        plates.push(6);
        plates.push(7);
        plates.push(8);
    }
}
