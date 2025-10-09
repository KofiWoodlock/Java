package iteration;

public class for_loops {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
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
    }
    
}
