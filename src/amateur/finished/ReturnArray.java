package amateur.finished;

//Given an array of integers, write a function that returns an array of 2 integers.
// The first integer will be the count of the positive integers, and the second integer will be the sum of the negative integers.
// If the input is empty or null, return an empty array.

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReturnArray {

    public static int[] countNumbers(int[] numbers){

        //check if given array is null/empty
        if(numbers.length == 0){
            return new int[0];
        }

        //placeholders to talley positive and negative numbers
        int totalPositives = 0;
        int sumOfNegatives = 0;

        //go through each number and see if number is positive or negative
        for(int number : numbers){

            if(number < 0){//if negative, add to sum of neg numbers
                sumOfNegatives += number;
            }
            else if(number > 0){//if positive, increase tally of positives
                totalPositives++;
            }
        }

        //return array
        return new int[]{totalPositives, sumOfNegatives};

    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(countNumbers(new int[]{1, -6, 5, 4, 3, -7, -10, 201, -3}))); //5, -26

    }


}
