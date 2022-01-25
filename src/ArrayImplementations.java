
//following code shows the implementation of arrays in project

import java.util.Scanner;

public class ArrayImplementations {

    private static Scanner scanner = new Scanner(System.in); // System.in to accept the inputs from console

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("Average of array = " + getAverage(myIntegers));
    }


    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integers bellow:- \r");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] =scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
