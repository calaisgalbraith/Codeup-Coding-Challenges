package amateur.finished;

//Write a function to remove these special characters from a string: ~,!,$,&,%, ,#,@,-,_,^,?,',",-
// (yes, "space" is a character in that list)

//char values
    //32 space, 33 !, 34 ", 35 #, 36 $, 37 %, 38 &, 39 ', 45 -, 63 ?, 95 _, 64 @, 94 ^, 126 ~,  8217 ’
    //32-39, 45, 62, 64, 94, 95, 126 --> no go

//Input: "Happy ~!&$%#@- Halloween" | Output: "HappyHalloween"
//Input: "I’ll bet living in a nudist-colony takes all the fun out of Halloween!!"
// Output: "IllbetlivinginanudistcolonytakesallthefunoutofHalloween"

public class RemoveSpecial {

    public static String removeSpecial(String sentence){
        StringBuilder fixedString = new StringBuilder(); //placeholder for string to return

        //loop through each char in sentence
        for(char letter : sentence.toCharArray()){

            //if letter is not a special characters, add it to fixedString
            if(!isSpecial(letter)){
                fixedString.append(letter);
            }
        }

        return fixedString.toString();
    }

    //method to see if char is speical character
    public static boolean isSpecial(char letter){
        //get numeric value of letter
        int value = (int) letter;

        //see if numeric value matches numeric values of special char (see notes above)
        if((value > 31 && value < 40) || value == 45 || value == 62 || value == 64 || value == 94 || value == 95 || value == 126 || value == 8217){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(removeSpecial("Happy ~!&$%#@- Halloween")); //HappyHalloween
        System.out.println(removeSpecial("I’ll bet living in a nudist-colony takes all the fun out of Halloween!!"));
            //IllbetlivinginanudistcolonytakesallthefunoutofHalloween
    }
}
