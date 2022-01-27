package intermediate.finished;

//Build a pyramid using the characters from a given string.

public class Pyramid {

    public static void pyramid(String letters){

        //index to print letter each time in pyramid
        int j = 1;

        //loop through each letter in string in reverse
        for(int i = letters.length() - 1; i >= 0; i--){

            //use .repeat to add index j amount of times
            System.out.println(String.valueOf(letters.charAt(i)).repeat(Math.max(0, j)));

            //increase j by 2
            j += 2;
        }
    }

    public static void main(String[] args) {
        pyramid("azb"); //b
                        //zzz
                        //aaaaa
    }
}
