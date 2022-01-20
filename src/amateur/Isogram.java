package amateur;

//An Isogram is a word that has no repeating letters, consecutive or not.
// Write a function that takes a string and returns true if it’s an isogram and false if it isn’t.

//Input: "fish" | Output: true
//Input: "food" | Output: false
//Input: "color" | Output: false

import java.util.ArrayList;

public class Isogram {

    public static boolean isogram(String word){

        //arr to keep track of char in word
        ArrayList<Character> letters = new ArrayList<>();

        //loop through each letter in word
        for(int i = 0; i < word.length(); i++){
            //if letters does not contain char at i
            if(!letters.contains(word.charAt(i))){

                //add unique letter to array, so can check against remaining letters
                letters.add(word.charAt(i));
            }
            else{//else must be a repeating letter so return false
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isogram("fish")); //true
        System.out.println(isogram("food")); //false
        System.out.println(isogram("color")); //false
    }
}
