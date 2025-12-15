/* Java - A Beginner's Guide - Task 3:1 */

import java.io.IOException;

public class help {
    public static void main(String[] args) throws IOException {    
        char choice, ignore;
        HelpGuide helpobj = new HelpGuide();

        System.out.println("---- Welcome to the Java help guide! ----"); 

        for(;;) {
            helpobj.showMenu();
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (!helpobj.isValid(choice))
                System.out.println("Invalid option selected!");
            else if (choice == 'q') break;
            else helpobj.helpWith(choice);
        }
    }
}

class HelpGuide {
    /* Displays help system menu */
    void showMenu() throws IOException {
        System.out.println();
        System.out.println("Help with:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("3. for");
        System.out.println("4. while");
        System.out.println("q. quit");
        System.out.println();
        System.out.println("Please select an option:");
    }

    /* Allows user to choose the topic they want help with */
    void helpWith(int c) {
            switch (c) {
                case '1':
                    ifHelp(); 
                    break;
                case '2':
                    switchHelp(); 
                    break;
                case '3':
                    forHelp(); 
                    break;
                case '4':
                    whileHelp(); 
                    break; 
                case '5':
                    classesHelp(); 
                    break; 
                default:
                    System.out.println("Invalid option selected.");            
                    break;
            }
    }

    boolean isValid(int c) {
        if (c < '1' || c > '4' & c != 'q') return false;
        return true;
    }

    /* Help guide to if statements */
    public static void ifHelp() { System.out.println("ifHelp() Called!"); }

    /* Help guide to switch statements */
    public static void switchHelp() { System.out.println("switchHelp() Called!"); }

    /* Help guide to for statements */
    public static void forHelp() { System.out.println("forHelp() Called!"); }

    /* Help guide to while statements */
    public static void whileHelp() { System.out.println("whileHelp() Called!"); }

    /* Help guide to classes */
    public static void classesHelp() { System.out.println("whileHelp() Called!"); }
}