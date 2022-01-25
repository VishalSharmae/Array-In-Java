public class Array {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];


        // What is Array in JAVA?
        //An array is a container object that holds a fixed number of values of a single type.
        // The length of an array is established when the array is created. ... An array of 10 elements.
        // Each item in an array is called an element, and each element is accessed by its numerical index.

        //Accessing those array elements
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        // Retrieving a value from an array
        System.out.println(myIntArray[5]);

        // Assigning values in array in one go

        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};

        // Third way to initialize the values in arrays

        int[] myIntArray3 = new int[25];

        for(int i = 0; i < myIntArray3.length; i++){
            myIntArray3[i] = i * 10;
            System.out.println("Element " + i + ", value is " + myIntArray3[i]);
        }
    }

    // using Arrays in method

    public static void printArray(int[] array){
        for (int i=0; i < array.length; i++){
            array[i] = i * 10;
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
