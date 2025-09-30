/* Key terms & code
    - Object
        - an entity that stores data (attributes) and functions that can be
        used to manipulate that data (methods)
    - Class 
        - a template to create objects that have similar properties   
    - New
        - keyword used to instanciate an object 
    - Object variable 
        - a variable that contains the memory location of an object
*/

import java.awt.Rectangle;


public class objects {
   public static void main(String[] args) {
    Rectangle cerealBox = new Rectangle(5, 10, 20, 30);
    Rectangle crealBoxPtr = cerealBox;
    cerealBox.translate(15, 25);
    System.out.println(cerealBox);
   } 
}
