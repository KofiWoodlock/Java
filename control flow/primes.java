/* Simple java program to determine the first n primes up until some upper bound k */

import java.util.Scanner;

public class primes {
    public static void main(String[] args) {
        int upper, base, multiple; 
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter an upper bound: "); 
            upper = in.nextInt();
        }
        int buffer[] = new int[upper];

        for (base = 2; base < upper; base++)
            for (multiple = 2 * base; multiple < upper; multiple += base) {
                buffer[multiple] = 1;
            }
        
        for (base = 2; base < upper; base++)
            if (buffer[base] == 0)
                System.out.println(base + " ");
    }
}
