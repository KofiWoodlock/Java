import java.util.*;
import java.io.*;

class ListNode {
    public String payload;
    public ListNode next;

    ListNode(String s, ListNode next) {
        this.payload = s;
        this.next = next;
    }
}

public class theAdrian20 {
    public static void main(String[] args) throws FileNotFoundException {
        q8("textdata.txt");
    }
    /* Prints out numbers from 1 - 100 */
    public static void q1() {
        for (int i = 1; i <= 100; i++)
            System.out.println(i);
    }
    /* Reverses an input string */
    public static void q2() {
        String out = "";
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Input:");
            String m = in.nextLine();

            for (int i = m.length() - 1; i >= 0; i--)
                out += m.charAt(i);
        }
        System.out.println(out);
    }
    /* Capitalises every alphabetic input within a string */
    public static void q3() {
        String m;
        String out = "";
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter some text: ");
            m = in.nextLine();
            
            out = m.toUpperCase();
        }
        System.out.println(out);
    }
    /* Evaluate simple binary arithmetic operators */
    public static void q4() {
        int x, y, i;
        Character op;
        String Sx = "";
        String Sy = "";
        String expr;

        try (Scanner in = new Scanner(System.in)) {
            /* Get user input expression */
            System.out.println("Enter an expression");
            expr = in.nextLine();
        }
        /* Parse tokens in form x op y */
        i = 0; 
        while (i < expr.length() && !Character.isWhitespace(expr.charAt(i))) {
            /* Get first operand */    
            Sx += expr.charAt(i++); 
        } 
        i++; /* Skip whitespace */
        op = expr.charAt(i++); /* get operator */
        i++; /* Skip whitespace */
        while (i < expr.length() && !Character.isWhitespace(expr.charAt(i))) {
            /* Get second operand */    
            Sy += expr.charAt(i++); 
        } 
        /* Convert string representations of numbers to integers */
        x = toInt(Sx);
        y = toInt(Sy);

        /* Match input operation */
        switch (op) {
            case '+':
                System.out.println(x+y);
                break;
            case '-':    
                System.out.println(x-y);
                break;
            case '*':    
                System.out.println(x*y);
                break;
            case '/':    
                System.out.println(x/y);
                break;
            default:
                System.out.println("Syntax error: unknown operator");
                break;
        }
    }
    /* Converts input string n to integer equivalent */
    private static int toInt(String n)  {
        int res = 0;
        int i;
        Character c;

        /* Skip whitespace */
        for (i = 0; Character.isWhitespace(n.charAt(i)); i++)
            ;;
        while (i < n.length()) {
            c = n.charAt(i);
            if (!Character.isDigit(c)) {
                break;
            }
            res = res * 10 + (c - '0');
            i++;
        }
        return res;
    }
    /* Prints words beginning with A or b from a text file */
    public static void q5(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String word = sc.next();
            if ((word.charAt(0) == 'A') || (word.charAt(0) == 'b'))
                System.out.println(word);
        }
        sc.close();
    }
    /* Prints words of length >= 10 from a text file */
    public static void q6(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() >= 10)
                System.out.println(word);
        }
        sc.close();
    }
    /* Reads contents of file into an array and prints array in reverse order */
    public static void q7(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        String words[] = new String[100];
        int i = 0;

        while (sc.hasNext()) {
            words[i] = sc.next();
            i++;
        }
        for (i = words.length - 1; i >= 0; i --) {
            if (words[i] != null)
                System.out.println(words[i]);
        }
        sc.close();
    }
    /* Reads contets of a file into a linked list and prints contents */
    public static void q8(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        ListNode head = new ListNode("", null); /* Dummy node for head insertion */
        while (sc.hasNext()) {
            ListNode newNode = new ListNode(sc.next(), head);
            head = newNode;
        }
        /* Print contents */
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.payload + " ");
            curr = curr.next;
        }
        sc.close();
    }
    /* Reads numbers from a file and computes mean, median, lower quartile, 
     * upper quartile and duplicates
     */
    public static void q9(String filename) throws FileNotFoundException {
        /* (i) Count number of lines */
        int numOflines = countLines(filename);

        /* (ii) Allocate array of size numOfLines */
        int nums[] = new int[numOflines];

        /* (iii) load array with nums */
        loadNums(nums, filename);

        /* (iv) Compute sum, mean, median, UP, LQ and duplicates */
        long sum = computeSum(nums);
        double mean = sum / (double) numOflines;
        double median = computeMedian(nums);
        double lq = computeLQ(nums);
        double uq = computeUQ(nums);
        Set<Integer> duplicates = findDuplicates(nums);
        
        /* Print data */
        System.out.println("Sum: " + sum);
        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Median: %.2f\n", median);
        System.out.printf("Lower Quartile: %.2f\n", lq);
        System.out.printf("Upper Quartile: %.2f\n", uq);
        System.out.println("Duplicates: "); 
        duplicates.forEach(System.out::println); 
    }
    /* Helper method to count number of lines in file for Q9 */
    public static int countLines(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        int numOfLines = 0;

        while (sc.hasNext()) {
            sc.nextLine();
            numOfLines++;
        }
        sc.close();
        return numOfLines;
    }
    /* Helper method to load numbers from file into array */
    public static void loadNums(int arr[], String filename) throws FileNotFoundException {
        File file = new File(filename);
        try (Scanner sc = new Scanner(file)) {
            int i = 0;
            while (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
                i++;
            }
            sc.close();
        }
    }
    /* Computes sum of array for Q9 */
    public static long computeSum(int arr[]) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    /* Computes the median of array for Q9 */
    public static double computeMedian(int arr[]) {
        if (arr.length % 2 == 1) 
            return arr[arr.length / 2];
        else
            return (arr[arr.length / 2] + arr[arr.length / 2 + 1]) / 2;
    }
    /* Computes lower quartile for Q9 */
    public static double computeLQ(int arr[]) {
        if (arr.length % 2 == 1) 
            return arr[(int) (arr.length * (1.0/4.0))];
        else
            return (arr[(int) (arr.length * (1.0/4.0))] + arr[(int) (arr.length * (1.0/4.0) + 1)]) / 2;
    } 
    /* Computes upper quartile for Q9 */
    public static double computeUQ(int arr[]) {
        if (arr.length % 2 == 1) 
            return arr[(int) (arr.length * (3.0/4.0))];
        else
            return (arr[(int) (arr.length * (3.0/4.0))] + arr[(int) (arr.length * (3.0/4.0) + 1)]) / 2;
    } 
    /* Finds dupilicates in an array for Q9 */
    public static Set<Integer> findDuplicates(int arr[]) {
        Set<Integer> duplicates = new HashSet<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1])
                duplicates.add(arr[i]);
        }
        return duplicates;
    }
    /* Reads lines from a file and prints them in reverse order with number of characters in line */
    public static void q10(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        int numLines = countLines(filename);
        String lines[] = new String[numLines];

        int j = 0;
        while (sc.hasNext()) {
            lines[j] = sc.nextLine();
            j++;
        } 
        for (int i = lines.length - 1; i >= 0; i--) {
            System.out.printf("%d:%s\n", lines[i].length(), lines[i]);
        }
        sc.close();
    }
    /* Computes the nth fibbonaci term */
    public static int q11(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return q11(n-1) + q11(n-2);
    }
    /* Returns the sum of f(n-1) + f(n-2) + f(n-3) else n where n < 2 */
    public static int q12(int n) {
        if (n < 2) return n;
        return q12(n-1) + q12(n-2) + q12(n-3);
    }
    /* Computes primes up to k-1  */
    public static void q13(int k) {
        boolean primes[] = new boolean[k];
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < k-1; i++)
            primes[i] = true;

        for (int p = 2; p*p < k-1; p++) {
            if (primes[p])
                for (int i = p*p; i < k-1; i += p)
                    primes[i] = false;
        }
        for (int i = 0; i < k-1; i++) {
            if (primes[i])
                System.out.println(i + " ");
        }
    }
    public static void q14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();

        int gcd = getGCD(a, b);
        System.out.println("GCD: "+ gcd);
        sc.close();
    }
    public static int getGCD(int a, int b) {
        if (a == 0)
            return b;
        return getGCD(b % a, a);
    }
    public static void q15() {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++)
            for (int j = i; j < nums.length; j++)
                if (nums[j] > nums[i]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
        for (int i = 0; i < 5; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}
