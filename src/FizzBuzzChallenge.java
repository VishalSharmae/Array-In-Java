import java.util.*;

public class FizzBuzzChallenge {

    // Write a fizzbuzz() method that takes in a number, n, and returns an ArrayList of the numbers from 1 to n.
    // For multiples of three, use "Fizz" instead of the number, and for the multiples of five, use "Buzz".
    // For numbers that are multiples of both three and five, use "FizzBuzz" (capitalization matters).
    //
    // For example, fizzbuzz(16) should return
    // [1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz", 16].

    public static ArrayList<Object> fizzbuzzList = new ArrayList<Object>();
    public static void main(String[] args) {
        System.out.println(fizzbuzz(136));
    }

    public static ArrayList fizzbuzz(int n)
    {
        for(int i = 1; i <= n; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                fizzbuzzList.add("FizzBuzz");
            }
            else if(i % 3 ==0 ){
                fizzbuzzList.add("Fizz");
            }
            else if(i % 5 == 0){
                fizzbuzzList.add("Buzz");
            }
            else{
                fizzbuzzList.add(i);
            }
        }
        return fizzbuzzList;
    }
}
