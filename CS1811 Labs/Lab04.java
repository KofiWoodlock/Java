/* Lab 04 Methods */

public class Lab04 {
	public static void main(String args[]) {
			
	}
	public static int maxInt(int y, int x) {
		int nums[] = {y, x};
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i]; 
		}
		return 0;
			
	}
	public static int minInt() { return 0; }
}
