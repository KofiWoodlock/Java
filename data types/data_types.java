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

public class data_types {
    public static void main(String[] args) {
        chars();
    } 
    public static void inches() {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;
        System.out.println("There are " + ci + " cubic inches in cubic mile");
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
        System.out.println("This is a character: " + a);

        // Char types can be manipulated using arithmetic expressions as they are 
        // just 16 bit intergral types under the hood
        System.out.println("var a has been incremented: " + ++a);

        // Chars can also be assigned integer values which will simply represent 
        // a character in the UNICODE character set 
        a = 67;
        System.out.println("var a is now: " + a);
        
    }
}
