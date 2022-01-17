package amateur.finished;

//Given a string of any length with any characters in it, write a function to determine
// whether or not the string contains the whole word "english".
// The order of characters/spelling is important, a string "agkjnenglishsad" would return true while "asdneglihsth"
// would return false. Upper and lower case does not matter. Return values should be booleans (true/false).

public class ContainsEnglish {


    public static boolean containsEnglish(String word){
        //check if lowercase of word(for consistency) contains "english"
        return (word.toLowerCase()).contains("english");
    }

    public static void main(String[] args) {
        System.out.println(containsEnglish("FaagdnglishAGG")); //false
        System.out.println(containsEnglish("SMFENgliSHasnD")); //true
    }


}
