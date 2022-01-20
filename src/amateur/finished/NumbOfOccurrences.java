package amateur.finished;

//Write a function to count the number of occurrences of a substring in a given string.

//Input: "The pumpkin rolled down the hill and under someone’s car.", "the"
//Output: 2

import java.util.ArrayList;

public class NumbOfOccurrences {

    public static int occurrences(String sentence, String substring){
        int occurrences = 0;

        //convert sentence to array, space is what separates each new entry
        String[] words = sentence.split(" ");

        //loop through each word in array
        for(String word  : words){
            //if word is equal to substring, increase occurrences (make lowercase bc case doesn't matter
            if((word.toLowerCase()).equals(substring.toLowerCase())){
                occurrences++;
            }
        }

        return occurrences;
    }


    public static void main(String[] args) {
        System.out.println(occurrences("The pumpkin rolled down the hill and under someone’s car.", "the")); //2
        System.out.println(occurrences("The Great Dane looked more like a horse than a dog.", "a")); //2
        System.out.println(occurrences("Sixty-Four comes asking for bread.", "three")); //0
    }
}
