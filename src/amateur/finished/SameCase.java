package amateur.finished;

//Write a function that takes a string and returns true if all of the characters are the same case, false otherwise

//Input: "hello world" | Output: true
//Input: "HELLO WORLD" | Output: true
//Input: "HeLLo wORld" | Output: false

import java.util.Locale;

public class SameCase {

    public static boolean checkCase(String sentence){

        //check if sentence equals lowercase version or if sentence equals upper case version (if so, means cases are all same)
        return sentence.equals(sentence.toLowerCase()) || sentence.equals(sentence.toUpperCase());
    }

    public static void main(String[] args) {
        System.out.println(checkCase("hello world")); //true
        System.out.println(checkCase("HELLO WORLD")); //true
        System.out.println(checkCase("HeLLo wORld")); //false
    }
}
