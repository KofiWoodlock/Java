package InputOutput;

import java.io.*;
import java.util.Scanner;

/* Key terms:
- Stream
    - A continuous flow of data that produces or consumes information
- Byte Stream
    - Input and output of 8 bits at a time 
- Character Stream 
    - Handles input and output of textual data as 16-bit Unicode
- FileInputStream
    - Class used to read data from a file in bytes
*/

public class IO {
    public static void main(String[] args) throws IOException {
        rBytes();

        /* General syntax FileInputStream(String fileName) throws FileNotFoundException */
        /* 
        Use int read() to read a single byte of data from a file
        and returns its integer value
        When finished with a file YOU MUST CLOSE IT by calling void close() 
        int i;
        FileInputStream file;
        if (args.length != 1) {
            System.out.println("Usage: ShowFile File");
            return;
        }
        try {
            file = new FileInputStream(args[0]); // Open file
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return;
        }

        try {
            // Read bytes until EOF is encountered 
            do {
                i = file.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O Exception: " + e);
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                System.out.println("I/O Exception: " + e);
            }
        }
        */

        /* Reading from files */
        System.out.println("Reading from files");
        File txtfile = new File("printme.txt"); 
        rFile(txtfile);
    }

    public static void rBytes() throws IOException {
        byte data[] = new byte[30];
        System.out.println("Enter your full name:");
        System.in.read(data);
        System.out.print("Hello ");
        for (int i = 0; i < data.length; i++)
            System.out.print((char) data[i]);
    } /* Reads data from a file */
    public static int rFile(File file) throws IOException {
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String word = sc.next();
                System.out.print(word + " ");
            }
            return 0;
        } catch (FileNotFoundException e) {
            System.err.println("Error! File Does Not Exist");
            return -1;
        }
    }
}