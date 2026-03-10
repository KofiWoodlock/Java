/* Key terms & code
    - hash table
        - An unordered collection of key-value pairs with a unique key for each
        value
    - hash set
        - Collection of unique elements implementing the set interface using
        a hash table
    - .equals()
        - A predefined method of the object class, used to check whether two
        objects have the same identity
    - .hashcode()
        - Returns an integer hashcode used in hash data structures    
 */

import java.util.HashMap;
import java.util.HashSet;

class Money {
    int amount;
    String currency;

    Money(int a, String c) {
        amount = a;
        currency = c;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Money))
            return false;
        Money other = (Money) obj;
        boolean equalCurrency = (this.currency == null && other.currency == null) 
        || (this.currency != null && this.currency.equals(other.currency));
        return this.currency == other.currency && equalCurrency;
    }

}


public class hash_tables {
    public static void main(String[] args) {

        /* Hashset usage */
       HashSet<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(11);
        nums.add(12);
        nums.add(13);
        for (int n: nums)
            System.out.println(n);

        /* Hashmap usage */
        HashMap<String, Integer> names = new HashMap<>();
        names.put("Joe", 22);
        names.put("Jeff", 30);
        names.put("Bob", 48);

        if (names.containsKey("Joe"))
            System.out.println("Joe is " + names.get("Joe") + " years old");


        /* Since Java supports generic hash data structures there needs to be a
         method for mapping objects to integers */

        /* .equals() and .hashCode() usage */
        Money income = new Money(55, "$");
        Money outgoings = new Money(55, "$");
        boolean break_even = income.equals(outgoings);
        if (break_even)
            System.out.println("You have broken even");        
        else 
            System.out.println("You have not broken even");
        /* The .equals() method needs to have the following properties
        - reflexive: an object must equal itself
        - symmetric: x.equals(y) must return the same result as y.equals(x)
        - transitive: if x.equals(y) and y.equals(z), then also x.equals(z)
        - consistent: the value of .equals() should change only if a property 
            that is contained in .equals() changes (no randomness allowed) */
    }    
}
