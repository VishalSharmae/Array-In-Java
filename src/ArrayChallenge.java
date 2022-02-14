import java.util.Random;
import java.util.Scanner;


public class ArrayChallenge {
    public static Scanner scanner = new Scanner(System.in);

// creating a different method to add two arrays in the returnMultiplication() method
    public static int[] addArray(int[] firstArray, int[] secondArray){

        int lengthArray1 = firstArray.length;
        int lengthArray2 = secondArray.length;

        int[] resultArray = new int[lengthArray1 + lengthArray2];
        System.arraycopy(firstArray, 0, resultArray, 0, lengthArray1);
        System.arraycopy(secondArray,0, resultArray, lengthArray1, lengthArray2 );

        return resultArray;

    }

    public static int returnMultiplications(int num){
        boolean flag = true; // setting the true condition to run the loop
        int count = 0; // count is the number of times multiplication will occur between the number and the random element
                       // selected from the array created, basically it is how many times we will enter the loop.

        while (flag){

            int tempNum= num;
            int lengthOfNum = String.valueOf(num).length();
            int[] firstArray = new int[lengthOfNum];

            for (int i = 0; i < lengthOfNum; i++){ // getting the reversed array of the number
            firstArray[i] = tempNum % 10;
            tempNum /= 10;
            }

            int tempLength = lengthOfNum;

            int[] reverseArray = new int[tempLength];
            for (int i = 0; i < lengthOfNum ; i++){ // reversing the obtained above array to get the desired array
                reverseArray[tempLength-1] = firstArray[i];
                tempLength--;
            }

            count++; // incrementing the count because the number will be multiplied once below
            Random randomNumber = new Random(); // using Random class from the java package
            int randomFromArray = reverseArray[randomNumber.nextInt(reverseArray.length)];
            int newNum = (num * randomFromArray); //newNum is the new number obtained from multiplying the integer with random number

            // converted the new obtained number into an array in the similar way above.
            int tempNum1= num;
            int lengthOfNum1 = String.valueOf(newNum).length();
            int[] repeatingArray = new int[lengthOfNum1];

            for (int i = 0; i < lengthOfNum1; i++){ // reversed array
                repeatingArray[i] = tempNum1 % 10;
                tempNum1 /= 10;
            }

            int tempLength1 = lengthOfNum1;
            int[] reverseArray1 = new int[tempLength1];
            for (int i = 0; i < lengthOfNum1 ; i++){ // correcting it
                reverseArray1[tempLength1-1] = repeatingArray[i];
                tempLength1--;
            }
            int[] resultArray = addArray(reverseArray,reverseArray1);

            for (int i = 0; i < resultArray.length-1; i++) { // fixed a bug here
                if (resultArray[i] == resultArray[i+1]) { // checking is their any equal adjacent pairs
                    flag = false;
                    // this will end the loop when we will get two same adjacent int values
                }
            }
            // changing the value of num
            num = 0;
            for (int i = 0; i < resultArray.length; i++){ // converting the array to integer
                num += resultArray[i] ;
                if (i < resultArray.length -1){
                    num *=10;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        System.out.println(returnMultiplications(scanner.nextInt()));
    }

}
