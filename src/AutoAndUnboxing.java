import java.util.ArrayList;

public class AutoAndUnboxing {

    //Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their
    // corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double,
    // and so on. If the conversion goes the other way, this is called unboxing.

    public static void main(String[] args) {

        //ArrayList<int> primitiveTypeArrayList = new ArrayList<int>();
        //Above code gives an error, Type argument cannot be of primitive type;

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(); //here Integer is not any primitive type, but it is a Class.

        for (int i = 1; i <= 10; i++){
            integerArrayList.add(Integer.valueOf(i)); // Integer.valueOf(i) is the example of autoboxing
        }
        for (int i = 0; i < integerArrayList.size(); i ++){
            System.out.println(i + " ------> " + integerArrayList.get(i).intValue()); // integerArrayList.get(i).intValue() is example of unboxing
        }

        Integer intValue = 98; // No error because at compile time Java Compiler changes it to Integer.valueOf(56); This is autoboxing;
        int myIntValue = intValue; // Java is converting it into intValue.intValue(); This is unboxing

        System.out.println();

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        for (double i = 0d; i <= 10d; i+=0.5){
            doubleArrayList.add(i);
        }

        for (int i = 0; i < doubleArrayList.size(); i++){
            System.out.println(i + " ----> " + doubleArrayList.get(i));
        }
    }

}
