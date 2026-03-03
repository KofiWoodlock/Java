/* Inheritance key terms & code 
    - inheritance
        - A property in Java that allows a class to take on properties and 
        behaviours from an existing class
    - superclass
        - A class that is inherited from
    - subclass
        - A class that inherits from the superclass
    - extends
        - Java keyword that denotes a class inherits from another class 
        general form: class A extends B {}
 */

class Shape {
    private double height; /* Note: if we set these class members to private then the
                    subclasses will not be able to access them */
    private double width;

    void showDims() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    double getHeight() { return height; }
    double getWidth() { return width; }
    void setHeight(double h) { height = h; }
    void setWidth(double w) { width = w; }

}

/* Note: you can only inherit from one superclass in Java */
class Triangle extends Shape {
    String style;

    double area() { return (getWidth() * getHeight()) / 2; } 
    String getStyle() { return style; }
}


public class inheritance {
    public static void main(String[] args) {
       Triangle a = new Triangle(); 
       a.setWidth(5);
       a.setHeight(4);
       a.style = "Green";

       a.showDims();
       System.out.println("Area of a: " + a.area());
       System.out.println(a.getStyle()); 
    }
}