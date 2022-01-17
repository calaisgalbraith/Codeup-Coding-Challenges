package amateur.finished;

//Write a function to convert a string into an array of words.
import java.util.Arrays;

public class ConvertString {

    public static String[] convertString(String words){
        return words.split(" ");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertString("Trick or Treat"))); //[‘Trick’, ‘or’, ‘Treat’]
    }
}
