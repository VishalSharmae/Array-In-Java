import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Count : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(count);

        System.out.println("Minimum element in the array is : " + findMin(array));
        System.out.println("Minimum element in the array is : " + findMinAgain(array));

    }

    public static int[] readIntegers(int count){

        int[] integers = new int[count];
        System.out.println("Enter the integers below :- \r");
         for (int i = 0; i < integers.length; i++){

             integers[i] = scanner.nextInt();

         }
         return integers;
    }

    public static int findMin(int[] array){
        int[] minArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int count;
        while(flag){
            flag = false;
            for (int i = 0; i < minArray.length - 1; i++){
                if (minArray[i] > minArray[i+1]){
                    count = minArray[i];
                    minArray[i] = minArray[i+1];
                    minArray[i+1] = count;
                    flag = true;
                }
            }
        }
        return minArray[0];
    }

    // Another method which I used in Maximum Minimum problem earlier

    private static int findMinAgain(int[] returnedArray){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < returnedArray.length; i ++){
            int x = returnedArray[i];
            if (x < min){
                min = x;
            }
        }
        return min;
    }
}
