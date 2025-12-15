package classes;

/* Key terms: 
 * data-class
    - A class that only stores instance members (no methods)
 * dot operator
    - Links an object with its member (object.member)
 * new operator
    - Dynamically (during runtime) allocates memory for an object & returns a reference to it
 * constructor
    - Initialises the instance members of an object when it is instaciated
 * defualt contstructor
    - An implicit constructor that sets all instance variables to their default values
    or 0, null and false for numeric types, reference types and booleans if no value has been set
 * parameterized constructor
    - A constructor that takes a list of arguments during instanciation
 * Garbage collection
    - A system that recalims dynamically allocated memory automatically when there are no references to
    an object
 * finalize()
    - A method called before an object is destroyed to ensure the object is destroyed cleanly
 * protected
    - An access specifier that limits access to the member or method only to members of the same class
    or subclasses
 * this keyword
    - An implicit argument that is a reference to the invoking object
 */

public class VehicleDemo {
    public static void main(String args[]) {
        /* To create an object we need to instanciate the class */
        Vehicle car = new Vehicle(5, 16, 33);
        /* the variable car is a reference to the memory location of the instance of the object Vehicle */
        /* To access instance variables we use object.member */
        /* Calculate the distance that can be travelled on a full tank */ 
        System.out.println("Car has " + car.passengers + " passengers and has a range of " + car.range() + " miles");

        /* References work differently to primitive types during assignment */
        Vehicle car1 = new Vehicle(0, 0, 0);
        Vehicle car2 = car1; /* car2 and car1 refer to the same object */
        /* the object can be acted upon by both car1 and car2 for example */
        car1.mpg = 26;
        System.out.println(car1.mpg);
        System.out.println(car2.mpg); /* output is the same */
    } 
}

// A class creates a new data type
// type 'Vehicle'
class Vehicle {
    int passengers; // Number of seats
    int fuelcap; // fuel capacity 
    int mpg; // fuel consumption

    Vehicle(int passenger, int fuel, int mpg) {
        this.passengers = passenger;
        this.fuelcap = fuel;
        this.mpg = mpg;
    }

    /* Displays the range of the vehicle */
    int range() {
        return fuelcap * mpg;
    }
    /* Computes the fuel needed to travel m miles */
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
