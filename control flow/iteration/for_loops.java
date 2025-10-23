package iteration;

public class for_loops {
    public static void main(String[] args) {
        nestedLoops();
        }
    /* Returns the sum of integer array */
    public static int arrSum(int nums[]) {
        int sum = 0;

        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1)
                System.out.print(nums[i]);
            else
                System.out.print(nums[i] + ",");
            sum += nums[i];
        }
        System.out.println("]");
        System.out.println("Sum of the array: " + sum);
        return sum;
    }
    public static void blowup() {
        for (;;) System.out.println("Nuke the program");
    }
    public static void nestedLoops() {
        int triangle[][] = {{1},
                           {1, 1},
                          {1, 2, 1},
                         {1, 3, 3, 1}
                    };
        

        /* Print triangle */ 
        int rows = triangle.length-1;
        for (int i = 0; i <= rows; i++) {

            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            } 
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
