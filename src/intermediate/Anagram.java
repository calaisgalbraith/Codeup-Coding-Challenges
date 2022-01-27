package intermediate;

//Determine whether or not a word is an anagram of another. Return true if it is, and false if it is not.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    public static boolean anagram(String first, String second){

        //convert strings to char arrays
        char[] firstSorted = first.toCharArray();
        char[] secondSorted = second.toCharArray();

        //sort char arrays (alphabetically)
        Arrays.sort(firstSorted);
        Arrays.sort(secondSorted);

        //see if sorted arrays equal each other
        return Arrays.equals(firstSorted, secondSorted);
    }

    public static void main(String[] args) {
        System.out.println(anagram("deco", "code")); //true
        System.out.println(anagram("last", "nope")); //false
    }

}
