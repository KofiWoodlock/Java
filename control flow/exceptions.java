/* Key terms & code
    - Exception 
        - Unexpected break in program flow causing the program to crash
 */

public class exceptions {
    public static void main(String[] args) {
        int nums[] = new int[10];
        try {
            System.out.println("Before exception is thrown");
            nums[100] = 10; /* ArrayIndexOutOfBounds exception */
            System.out.println("This code won't be exectuted");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index out of bounds!");
        }
        System.out.println("Try-catch executed.");

        /* Methods within try blocks can throw exceptions which can be caught */

    } 

    /* Computes the value of an exponential function f(x) = k^x */
    public static double exp(double k, double x) {
        return 0.0;
    }
    /* Computes the value of a reciprocal function f(x) = x^-e */
    public static double rcpl(double x, double e) {
        if (e >= 0) {
            System.out.println("Exponent must be negative");
            return 0.0;
        }
        double res = 0.0;
        try {
            res = exp(x, e);
            return res;
        } catch (ArithmeticException exception) {
            System.out.println("Error: " + exception);
            return 0.0;
        }
    }
}
