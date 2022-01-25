import java.util.Scanner;

public class SortedArray {

    private static Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegers(7);
        int[] sorted = sortIntegers(array);
        printArray(sorted);

    }

    public static int[] getIntegers(int number){   // returns an array of entered integers from keyboard in console

        int[] valuesArray = new int[number];
        System.out.println("Enter the " + number + " integers below :- \r");
        for (int i =0; i < valuesArray.length; i++){
            valuesArray[i] = scanner.nextInt();
        }
        return valuesArray;
    }

    public static void printArray(int[] array){ // method prints the content means the elements of array
        for (int i = 0; i < array.length; i ++){
            System.out.println("Element no. " + i + ", entered value is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < sortedArray.length; i++){
            sortedArray[i] = array [i];
        }
        boolean flag = true;
        int test;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    test = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = test;
                    flag =true;
                }
            }
        }
        return sortedArray;
    }

}
