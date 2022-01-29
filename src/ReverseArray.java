import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the no. of elements of Array below : \r");

        int[] inputArray = new int[scanner.nextInt()];

        for (int i = 0 ; i < inputArray.length; i ++ ){
            System.out.println("Enter Element " + i + " : " );
            inputArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        reverse(inputArray);
    }

    public static void reverse(int[] array){
        int[] reverseArray = new int[array.length];
        ;
        for (int i = 0; i < array.length; i++){

            reverseArray[i] = array[array.length - (i + 1)];
        }
        System.out.println("Input Array : " + Arrays.toString(array));
        System.out.println("Output Array : " + Arrays.toString(reverseArray));
    }
}
