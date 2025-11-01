import java.util.InputMismatchException;
import java.util.Scanner;

public class avrg_height {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_people = getNumPeople(input);
        System.out.println(num_people);
        double total = 0;
        double avg = 0;

        for (int i = 0; i < num_people; i++) {
            total += getHeight(input, i+1);
        }
        avg = total / num_people;
        System.out.println("The average height is: " + avg);

    } 
    public static int getNumPeople(Scanner in) {
        int num;

        try {
            System.out.println("Enter the number of people: ");
            num = in.nextInt();

            while (num <= 0) {
                System.out.println("Enter the number of people: ");
                num = in.nextInt();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Error: Please enter a valid number");
            num = -1;
        }
        return (num > 0) ? num : -1;

    }
    public static double getHeight(Scanner in, int personNum) {
        double h;

        try {
            System.out.println("Enter the height of person "+ personNum + " in meters");
            h = in.nextDouble();

            while (h <= 0) {
                System.out.println("Enter the height of person "+ personNum + " in meters");
                h = in.nextDouble();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Error: Please enter a valid number");
            h = 0;
        }
        return h;
    }
}
