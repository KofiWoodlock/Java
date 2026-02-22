/* Key terms:
 * String
    - An object that represents a sequence of characters  
 * m.equals(s)
    - A String method that returns true if m has the same character
    sequence as s
 * length()
    - Returns the length of a string
 * m.charAt(i)
    - Returns the character at index i
 * m.compareTo(s)
    - Returns <0 if m < s, returns >0 if m > s or returns 0 if m == s
 * m.indexOf(s)
    - Searches m for the substring s and returns index of first match else -1
 * m.lastIndexOf(s)
    - Searches m for the substring of s and returns the index of the last match else -1
 * String + String
    - String concatenation 
 * Immutable 
    - Cannot be changed after it's creation
 * m.substring(i, j)
    - Creates a new string object consiting of the substring from i to j of m 
    the ending index is exclusive so to include the character at j the end index
    must be j+1
 */

public class strings {
   public static void main(String[] args) {
        String m = "Hello World!";
        String s = "Cheese Grater";
        String n = "orl";
        String t = "Hello World!";
        System.out.println(m.equals(s));
        System.out.println(m.equals(t));
        System.out.println("m is of length: " + m.length());
        System.out.println(m.charAt(6));
        System.out.println(m.compareTo(s)); 
        System.out.println(m.indexOf(n));
        m += s;
        System.out.println(m);
        System.out.println();

        /* Strings are immutable in Java */
        /* However Java does provide mutable strings via the StringBuffer and StringBuilder objects */
        System.out.println("We can demostrate the immutability of Strings using .subString()");
        String original = "abcde";
        String sub = original.substring(1, 4);
        System.out.println("substring: " + sub);
        System.out.println("original: " + original);
        System.out.println();

        System.out.println("Since JDK 7 switches can be controlled by Strings");
        String cmd = "cancel";
        switch (cmd) {
            case "connect":
                System.out.println("Connecting...");
                break;
            case "cancel":
                System.out.println("Cancelling...");
                break;
            case "disconnect":
                System.out.println("Disconnecting...");
                break;
            default:
                System.out.println("CMD Error!");
                break;
        }
        System.out.println("Converting a string to uppercase");
        System.out.println(toLower("I AM ALL LOWERCASE"));
        System.out.println(toUpper("i am all uppercase"));
   } 
   /* Converts every character in s to uppercase */
   public static String toUpper(String s) {
        char c;
        String out = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'a' || s.charAt(i) > 'z')
                out += s.charAt(i);
            else
                out += (char) ((int) s.charAt(i) & 65503);
        }
        return out;
   }
   /* Converts every character in s to lowercase */
   public static String toLower(String s) {
        char c;
        String out = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'A' || s.charAt(i) > 'Z')
                out += s.charAt(i);
            else
                out += (char) ((int) s.charAt(i) | 32);
        }
        return out;
   }
}
