/* Key terms & code
    - Boolean 
        - A data type to represent true or false values 
    - Byte 
        - 8 bit integer
    - Char
        - Character
    - Double
        - double precision floating point number (64 bit float)
    - Float
        - single precision floating point number 
    - Int
        - a positive or negative whole integer
    - Long 
        - long integer (supports larger numbers using more bits)
    - Short
        - Short intgeger (supports smaller numbers using less bits)
 */

import static java.lang.System.out;
import java.util.Scanner;

public class data_types {
    public static void main(String[] args) {
        chars();
        booleans();
        add();
    } 
    public static void inches() {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;
        out.println("There are " + ci + " cubic inches in cubic mile");
    }
    /* Computes the length of the hypotenuse of a right triangle */
    public static double pythag(double a, double b) {
        double res = a*a + b*b;
        res = Math.sqrt(res);
        return res;
    }
    public static void chars() {
        /* In Java characters are 16-bit unsigned intergral types */
        char a; 
        a = 'A';
        out.println("This is a character: " + a);

        // Char types can be manipulated using arithmetic expressions as they are 
        // just 16 bit intergral types under the hood
        out.println("var a has been incremented: " + ++a);

        // Chars can also be assigned integer values which will simply represent 
        // a character in the UNICODE character set 
        a = 67;
        out.println("var a is now: " + a);
        
    }
    public static void booleans() {
        // The boolean type represents true or false
        boolean b = false;
        out.println("The value of b is: " + b);
        b = true;
        out.println("The value of b is: " + b);
        // Booleans can be used in conditionals to control whether some statement is executed 
        if (b) out.println("This is executed");
        b = false;
        if (b) out.println("This is not executed");
        // A relation operator returns a boolean value
        out.println("10 > 9 is " + (10 > 9));
    }
    public static void add() {
        int a, b;
        int sum;
        try (Scanner input = new Scanner(System.in)) {
            out.println("Enter a number: ");
            a = input.nextInt();
            out.println("Enter another number: "); 
            b = input.nextInt();
        }
        sum = a + b;
        out.println("result: " + sum);
    }
}
