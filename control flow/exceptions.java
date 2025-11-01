public class exceptions {
    public static void main(String[] args) {
    } 

    /* Computes the value of an exponential function f(x) = k^x */
    public static double exp(double k, double x) {
        return 0.0;
    }
    /* Computes the value of a reciprocal function f(x) = x^-e */
    public static double rcpl(double x, double e) {
        if (e >= 0) {
            System.out.println("Exponent must be negative");
            return 0.0;
        }
        double res = 0.0;
        try {
            res = exp(x, e);
            return res;
        } catch (ArithmeticException exception) {
            System.out.println("Error: " + exception);
            return 0.0;
        }
    }
}
