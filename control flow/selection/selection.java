package selection;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class selection {
    public static void main(String[] args) throws IOException {
        game();        
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
                else System.out.println("Incorrect!");
            }
        } catch (IOException e) {
            System.out.println("Error!" + e);
        }
    }
}