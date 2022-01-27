package intermediate.finished;

//Return the sum of all of the numbers in a given string divided by the number of letters.
// The answer should be rounded to the nearest whole number.

//ex: Input: H3llo fr13nd9 | Output: 2 (9+3+3+1 = 16, 16 / 8 letters = 2)

public class SumOfNumbers {


    public static int sumOfNumbers(String letters){
        //placeholders for sum of numbers and number of total letters
        int sum = 0;
        int totalLetters = 0;

        //loop through each char in string and see if numeric or letter
        for(int i = 0; i < letters.length(); i++){

            //check if char is a number
            if(Character.isDigit(letters.charAt(i))){
                sum += Character.getNumericValue(letters.charAt(i));
            }

            //check if char is a letter
            else if (Character.isLetter(letters.charAt(i))){
                totalLetters++;
            }
        }

        return sum / totalLetters;
    }



    public static void main(String[] args) {
        System.out.println(sumOfNumbers("H3llo fr13nd9")); //2
    }

}
