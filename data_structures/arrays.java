package data_structures;
import java.util.Scanner; public class arrays {
    public static void main(String[] args) {
        /* The String[] args is an array of command line arguments 
        for example when compiling a program we could pass some arguments
        Generally it is javac MyProg arg1 arg2 arg3 ... argn
        */ 

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
        
        // System.out.println("Getting arguments from cmd line");
        // int[] p = getInts();
        // System.out.println(p);
        // System.out.println();

        /* Two-dimensional arrays
            Useful for representing grids, matricies, graphs etc 
            General definition for two dimensional array is as follows:

            type[][] identifier = new type[num_rows][num_cols];
            Yet, type identifier[][] = new type[num_rows][num_cols]; is also valid
            Note: the num_cols field can be omitted that is new type[num_rows][] is valid

            The general initialisation for a 2d array is as follows: 

            type[][] identifier = {{a,b,c}, {m,n,p}, {x,y,z}};
            This creates a 3x3 grid with the specified values

        */
        int grid[][] = { 
                        {1,2,3}, 
                        {4,5,6}, 
                        {7,8,9}
                    };

        printgrid(grid);
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
    /* Prints the contents of a two dimensional array */
    public static void printgrid(int[][] g) {
        int rows = g.length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < g[i].length; j++) {
                if (j == g[i].length - 1)
                    System.out.print(g[i][j]); 
                else
                    System.out.print(g[i][j] + " ");
            }
        System.out.println();
        }
    }
}
