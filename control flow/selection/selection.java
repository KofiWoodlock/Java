package selection;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class selection {
    public static void main(String[] args) throws IOException {
        // game();        
        switches();
    }
    /* Letter guessing game */
    public static void game() throws IOException{        
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            char ch = '\0'; 
            char answer = 'K';
            boolean notGuessed = true;

            while (notGuessed) {
                System.out.println("Guess a letter between A - Z:");
                String input = reader.readLine();

                if (input.length() == 0) continue; 
                ch = Character.toUpperCase(input.charAt(0));

                if (ch == answer) { 
                    System.out.println("Correct!"); 
                    notGuessed = false;
                }
                else  {
                    System.out.println("Incorrect!");
                    if (ch < answer) System.out.println("You're guess is too low");
                    else System.out.println("You're guess is too high");
                }
            }
        } catch (IOException e) {
            System.out.println("Error!" + e);
        }
    }
    /* Method to demonstrate switch statements */
    public static void switches() {
        int number;

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a number");
            number = in.nextInt();
        }

        switch (number) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Number is not between 1-3");
        }
        /* Nested switches */
        char ch1 = 'A';
        char ch2 = 'B';

        switch (ch1) {
            case 'A': System.out.println("outer ch1 is A");
                switch (ch2) {
                    case 'A':
                        System.out.println("inner ch2 is A");
                        break;
                    case 'B':
                        System.out.println("inner ch2 is B");
                }
                break;
            case 'B':
                System.out.println("outer ch1 is B");
                break;
        }
    }
}