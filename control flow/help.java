/* Java - A Beginner's Guide - Task 3:1 */

import java.util.Scanner;

public class help {
    public static void main(String[] args) {

        int choice;
        boolean validInput = false;
        
        System.out.println("---- Welcome to the control flow help guide! ----"); 
        System.out.println();
        System.out.println("Help with:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("3. for");
        System.out.println("4. while");
        System.out.println();
        System.out.println("Please select an option:");

        while (!validInput) {
            try (Scanner in = new Scanner(System.in)) {
                choice = in.nextInt();
            }
            switch (choice) {
                case 1:
                    validInput = true;
                    ifHelp(); 
                    break;
                case 2:
                    validInput = true;
                    switchHelp(); 
                    break;
                case 3:
                    validInput = true;
                    forHelp(); 
                    break;
                case 4:
                    validInput = true;
                    whileHelp(); 
                    break; 
                default:
                    System.out.println("Invalid option selected.");            
                    break;
            }
        }

    }    
    /* Help guide to if statements */
    public static void ifHelp() { System.out.println("ifHelp() Called!"); }

    /* Help guide to switch statements */
    public static void switchHelp() { System.out.println("switchHelp() Called!"); }

    /* Help guide to for statements */
    public static void forHelp() { System.out.println("forHelp() Called!"); }

    /* Help guide to while statements */
    public static void whileHelp() { System.out.println("whileHelp() Called!"); }
}
