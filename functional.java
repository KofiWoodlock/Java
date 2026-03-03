/* Functiinal Programming - Key terms & code 
    - functional programming
        - Declarative programming paradigm that uses functions and composition
        to implement a program 
    - anonymous classes
        - allows for declaration and instantiation of a class simultaneosly
        with no name
    - anonymous funtion
        - A function not bound to an identifier and passed to a higher order
        function
    - function interface 
        - A functional interface that takes an input of type T and returns a 
        value of type R
    - first-class-object
        - Any object that can be stored in a variable, passed to or returned 
        from a fucntion
    - stream
        - A sequence of elements supporting sequential and parallel aggregate operations 
 */

/* Useful link:
https://www.freecodecamp.org/news/functional-programming-in-java
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Thermostat {
   private int idealTmp; 
   private Runnable coolDown;
   private Runnable warmUp;

   public Thermostat(int tmp, Runnable coolAction, Runnable warmAction) {
        idealTmp = tmp;
        coolDown = coolAction;
        warmUp = warmAction;

   }

   public void updateTmp(int newTmp) {
        if (newTmp > idealTmp) {
            coolDown.run();
        } else {
            warmUp.run();
        }
   }

}

public class functional {
    public static void main(String[] args) {
        /* We can use anonymous classes to implement heater and AC actions */
        // Thermostat thermostat = new Thermostat(
        //     21,
        //     new Runnable() {
        //         @Override
        //         public void run() {
        //             System.out.println("AC on.");
        //         }
        //     },
        //     new Runnable() {
        //         @Override
        //         public void run() {
        //             System.out.println("Heater on"); 
        //         }
        //     });
        /* We can also use anonymous functions to provide a run method for the runnable */
        Thermostat thermostat = new Thermostat(
            21,
            () -> { System.out.println("AC on."); }, 
            () -> { System.out.println("Heater on."); }
        );
        thermostat.updateTmp(15);
        thermostat.updateTmp(25);

        System.out.println("---- Using Streams ----");
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 10; i++)
            nums.add(i);        
        Stream<Integer> stream = nums.stream();
        Stream<Integer> evens = stream.filter(n -> n % 2 == 0);
        evens.forEach((i) -> {
            System.out.println(i);
        });
    }

}

