
//Write a function that takes in a string variable and returns that string reversed.
// While most languages provide their own built-in functions to do this, the point of this challenge is to write your own.


public class StringReversal {

    public static String reversal(String word){

        StringBuilder reversedWord = new StringBuilder(); //string to hold reversed value

        //loop through letters, from end to beginning, and add to reversedWord
        for(int i = word.length() - 1; i >= 0; i--){
            reversedWord.append(word.charAt(i));
        }

        return String.valueOf(reversedWord);
    }


    public static void main(String[] args) {
        System.out.println(reversal("ABC")); //CBA
        System.out.println(reversal("Jubilee"));  //eelibuJ
        System.out.println(reversal("Chanel")); //lenahC
        System.out.println(reversal("Calais")); //sialaC
    }
}
