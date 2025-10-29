public class Lab02 {
    public static void main(String[] args) {
        getremainder(19, 3);
        getmean(5, 6);
    }
    /* Prints the quotient and remainder of x divided by y */
    private static void getremainder(int x, int y) {
        int q, r;

        q = x / y;
        r = x % y;
        System.out.println("Quotient: " + q + "\nRemainder: " + r);
    }
    /* Prints the mean of x and y */
    private static void getmean(int x, int y) {
        int sum;
        double mean;

        sum = x + y;
        mean = sum / 2.0;
        System.out.println("Mean: " + mean);

    }
}

