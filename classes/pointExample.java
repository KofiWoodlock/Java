package classes;

public class pointExample {
    public static void main(String[] args) {
        Point A = new Point(5.0, 10.0, "A");

        /* Implementing a toString method can be useful for debugging */
        System.out.println(A);

        /* When dealing with objects it is possible to have multiple variables 
         * that reference the same object in heap memory
         */
        System.out.println("Example of two variables modifying same data");
        Point x = new Point(5, 10, "Point X");
        Point y = x;

        System.out.println(x);

        y.setX(0);
        System.out.println(x);
        System.out.println(y);
    }     
    
}

class Point {
    /* private access modifier only allows methods within the class to modify
     * the values of x and y
     */
    private double x, y;
    String label;

    /* We can initialise attribute values using constructors */
    Point(double x, double y, String label) { this.x = x; this.y = y; this.label = label; }
    Point(double x, double y) { this.x = x; this.y = y; this.label = ""; }

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

class Triangle {
    Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
}
