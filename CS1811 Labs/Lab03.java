/* Lab 03 - Branching & Iteration */

import java.util.Scanner;

public class Lab03 {
	public static void main(String[] args) {
		//signal();		
		//prices();
		//summing();
		System.out.println(factorial(5));
	}
	/* Exercise 1  */
	public static void signal() {
		Scanner in = new Scanner(System.in);	
		int n;
		System.out.println("Enter a number:");
		n = in.nextInt();
		if (n >= 0)
			System.out.println("Number is positive");
		else
			System.out.println("Number is negative");
	}
	/* Exercise 2 */
	public static void prices() {
		Scanner in = new Scanner(System.in);	
		int age;	
		System.out.println("Enter your age:");
		age =  in.nextInt();
		if (age < 26 || age >= 65 ) 
			System.out.println("Price reduction applicable");
		else
			System.out.println("Full price");
	}
	/* Exercise 3 */
	public static void summing() {
		Scanner in = new Scanner(System.in);
		int n, sum;
		int i = 0;
		System.out.println("Enter a value for n");
		n = in.nextInt();
		sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("Result: " + sum);
	}
	/* Exercise 4 */
	public static int factorial(int x) {
		int product = 0;
		return product;
	}

}
