package data_structures;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        /* Declaring arrays  */ 
        // int [] intArr1, intArr2, intArr3;   /* These declarations are equal */
        // int arr1[], arr2[], arr3[];

        /* We can allocate memory for an array by specifying it's size or it's 
         * elements
         */
        //int arr1[] = new int[20]; /* Allocates an array of 20 elements on the heap */
        int arr2[] = {1, 2, 3, 4, 5};

        System.out.println("Iterating over an array");
        for (int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]); 
        System.out.println();
        
        System.out.println("Getting arguments from cmd line");
        int[] p = getInts();
        System.out.println(p);

        System.out.println();
    }
    public static int getInt() {
        int num;
        System.out.println("Enter a number:");
        try (Scanner in = new Scanner(System.in)) {
            num = in.nextInt();
        }
        return num;
    }
    public static int[] getInts() {
        int size;
        
        System.out.println("Enter the number of integers to store:");
        try (Scanner in = new Scanner(System.in)) {
            size = in.nextInt(); 
        }
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) 
            nums[i] = getInt(); 
        return nums;
    }
}
