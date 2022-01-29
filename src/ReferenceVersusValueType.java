import java.util.Arrays;

public class ReferenceVersusValueType {

    public static void main(String[] args) {

        int myValue = 10;
        int anotherValue = myValue;

        System.out.println("myValue = " + myValue );
        System.out.println("anotherValue = " + anotherValue);

        anotherValue++;

        System.out.println("myValue = " + myValue );
        System.out.println("anotherValue = " + anotherValue);

        // Above is the example of value types; A single space in memory is allocated to store the value and
        // that variable directly holds the value. If we assign it to another variable the value is copied directly
        // and both the variables works independently afterwards

        int[] myIntArray = new int[5]; // variable myIntArray with 5 elements and works as a reference,
                                       // that means arrays are reference types; i.e. reference types are used as references.
                                       // reference holds an address to the object, but not the object itself
                                       // variable myIntArray holds a reference or an address to an array in memory
                                        // with reference types we are using a reference to control the object in memory.

        int[] anotherArray = myIntArray; // both variables hold the same address

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // Arrays in-built function imported from java.utils.Arrays
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("changed myIntArray = " + Arrays.toString(myIntArray)); // Arrays in-built function imported from java.utils.Arrays
        System.out.println("changed anotherArray = " + Arrays.toString(anotherArray));

        // output above changed values of both the arrays, that is the way references works because reference type represents the address of the variable rather than the data itself;

    }
}
