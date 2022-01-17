package amateur.finished;

//Write a function that takes an array of integers and returns an array of integers where each number
// is the sum of itself and all of the previous numbers in the array.

import java.util.Arrays;

public class SumArrays {

    public static int[] sumArrays(int[] numbers){
         int[] sums = new int[numbers.length];

         int talley = 0; //placeholder for sum of previous numbers

        //loop through each number in array
        for(int i = 0; i < numbers.length; i++){
            talley+= numbers[i]; //add number at index i to talley
            sums[i] = talley; //set index i in sums to talley
        }

         return sums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumArrays(new int[]{1, 1, 1}))); // [1, 2, 3]
        System.out.println(Arrays.toString(sumArrays(new int[]{4, 2, 1, 3, 5})));  // [4, 6, 7, 10, 15]
    }
}
