package classes.methods;

/*  Key terms & code 
    - Access modifier
        - A set of keywords in Java that control what code has access to member
        of classes
    - public
        - Allows any code to access the member of the class
    - private
        - Allows any code within the same class access to the member of that class
    - protected
        - Allows any code within the same class or subclasses to acess the member
        of that class
 */

class FailSoftArray {
    private int arr[];
    private int errval;
    public int len;

    public FailSoftArray(int size, int errval) {
        arr = new int[size];
        this.errval = errval;
        len = size;
    }

    /* Return value at specified index */
    public int get(int index) {
        if (validIndex(index)) return arr[index];
        return errval;
    }

    public boolean put(int index, int val) {
        if (validIndex((index))) {
            arr[index] = val;
            return true;
        }
        return false;
    }

    /* Returns true if index is within array bounds */
    private boolean validIndex(int index) {
        if (index >= 0 & index < len) return true;
        return false;
    }

}

public class methods {
    public static void main(String[] args) {
        FailSoftArray a = new FailSoftArray(5, -1);
        int x;

        System.out.println("Fail quietly");
        for (int i = 0; i < (a.len * 2); i++)
            a.put(i, i*10);

        for (int i = 0; i < (a.len * 2); i++)
            x = a.get(i);
    }
}