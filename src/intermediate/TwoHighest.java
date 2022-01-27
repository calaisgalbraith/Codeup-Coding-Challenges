package intermediate;

//Write a function to find the TWO highest values in an array..

// Example [ 12, 34, 56, 1 ]
//    Answer: 34, 56
//b.  Example[ 0, -12,-34, -50,-1 ]
//    Answer: 0, -1

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoHighest {

    public static List<Integer> highest(List<Integer> numbers){

        //sort given array
        Collections.sort(numbers);

        //return last two (highest) numbers in array
        return Arrays.asList(numbers.get(numbers.size() - 2), numbers.get(numbers.size() - 1));
    }


    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(12, 34, 56, 1);
        List<Integer> list2 = Arrays.asList(0, -12, -34, -50, -1);

        System.out.println(highest(list1).toString()); //34, 56
        System.out.println(highest(list2).toString()); //-1, 0

    }
}
