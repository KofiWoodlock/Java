/* Key terms & code
    - Parameterized type
        - A data type that is specifide as a parameter to a class, method or interface
    - Generic
        - Any class, method or interface that operates on a type parameter
    - Autoboxing 
        - Automatic conversion by the java compiler between primitive types and
        their object wrappers classes
    - Erasure
        - 
 */

/* T is the generic type which will be replaced by the type parameter */
class Generic<T> {
    T obj;

    Generic(T ob) {
        obj = ob;
    }

    /* Getter for obj */
    public T getObj() {
        return obj;
    }

    /* Print obj type */
    void type() {
        System.out.println("Type: " + obj.getClass().getName());
    }

}

public class generics {
    public static void main(String[] args) {
        /* We can create a generic reference for integers */
        Generic<Integer> object;
        /* Autoboxing is used to wrap the primitive integer argument with its 
        class wrapper */
        object = new Generic<Integer>(50);  
        object.type();
        /* Autounboxing is used when retreving the object so that the primitive 
        is returned */
        System.out.println(object.getObj());
    }
}