package classes.methods;

public class methods {
    public static void main(String[] args) {
        Point A = new Point(5.0, 10.0, "A");

        /* Implementing a toString method can be useful for debugging */
        System.out.println(A);
    }     
}

class Point {
    /* private access modifier only allows methods within the class to modify
     * the values of x and y
     */
    private double x, y;
    String label;

    /* We can initialise attribute values using constructors */
    Point(double iX, double iY, String iLabel) { x = iX; y = iY; label = iLabel; }
    Point(double iX, double iY) { x = iX; y = iY; label=""; }

    /* We should create getter methods to control the access to the class 
     * attributes 
     */
    public double getX() { return x; }
    public double getY() { return y; }

    /* We can also create setter methods to control modification of the class
     * attributes 
     */
    public void setX(double nX ) { x = nX; }
    public void setY(double nY ) { x = nY; }

    /* We can use overriding to change the functionality of a method inherited
     * from a super class
     */
    public String toString() { return "(" + x + ", " + y + ")" + " '" + label + "'"; }
}