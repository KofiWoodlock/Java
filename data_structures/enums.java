/* Key terms:
 * Enumeration
    - A data type that corresponds to a set of constants
 * name()
    - Returns the name of this type member
*/

public class enums {
    public static void main(String[] args) {
        System.out.println("The days of the week are:");
        for (Day day : Day.values())
            System.out.println(day);
    }
}

enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}