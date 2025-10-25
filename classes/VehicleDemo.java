package classes;

public class VehicleDemo {
    public static void main(String args[]) {
        /* To create an object we need to instanciate the class */
        Vehicle car = new Vehicle();
        /* To access instance variables we use object.member */
        car.fuelcap = 16;
        car.passengers = 5;
        car.mpg = 33;
        /* Calculate the distance that can be travelled on a full tank */
        int d = car.fuelcap * car.mpg;
        System.out.println("Car has " + car.passengers + " passengers. With a max distance of miles" + d);
    } 
}

// A class creates a new data type
// type 'Vehicle'
class Vehicle {
    int passengers; // Number of seats
    int fuelcap; // fuel capacity 
    int mpg; // fuel consumption
}
