import java.util.Random;
import java.util.Scanner;


public class ArrayChallenge {
    public static Scanner scanner = new Scanner(System.in);


    public static int[] addArray(int[] firstArray, int[] secondArray){

        int lengthArray1 = firstArray.length;
        int lengthArray2 = secondArray.length;

        int[] resultArray = new int[lengthArray1 + lengthArray2];
        System.arraycopy(firstArray, 0, resultArray, 0, lengthArray1);
        System.arraycopy(secondArray,0, resultArray, lengthArray1, lengthArray2 );

        return resultArray;

    }
    public static int returnMultiplications(int num){
        boolean flag = true;
        int count = 0;

        while (flag){
        int tempNum= num;
        int lengthOfNum = String.valueOf(num).length();
        int[] firstArray = new int[lengthOfNum];

        for (int i = 0; i < lengthOfNum; i++){
            firstArray[i] = tempNum % 10;
            tempNum /= 10;
        }

        int tempLength = lengthOfNum;
        int[] reverseArray = new int[tempLength];
        for (int i = 0; i < lengthOfNum ; i++){
            reverseArray[tempLength-1] = firstArray[i];
            tempLength--;
        }



            count++;
            Random randomNumber = new Random();
            int randomFromArray = reverseArray[randomNumber.nextInt(reverseArray.length)];
            int newNum = (num * randomFromArray);

            int tempNum1= num;
            int lengthOfNum1 = String.valueOf(newNum).length();
            int[] repeatingArray = new int[lengthOfNum1];

            for (int i = 0; i < lengthOfNum1; i++){
                repeatingArray[i] = tempNum1 % 10;
                tempNum1 /= 10;
            }

            int tempLength1 = lengthOfNum1;
            int[] reverseArray1 = new int[tempLength1];
            for (int i = 0; i < lengthOfNum1 ; i++){
                reverseArray1[tempLength1-1] = repeatingArray[i];
                tempLength1--;
            }
            int[] resultArray = addArray(reverseArray,reverseArray1);

            if (resultArray[lengthOfNum-1] == resultArray[lengthOfNum]){
                flag = false;
                // this will end the loop when we will get two same adjacent int values
            }
            num = 0;
            for (int i = 0; i < resultArray.length; i++){
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
