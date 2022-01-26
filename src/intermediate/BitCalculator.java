package intermediate;

//Create a bit calculator.
// You will be given two numbers that have been translated into bit form.
// You must return the sum of those two numbers in decimal form.

public class BitCalculator {

    public static double bitCalculator(String first, String second){
        //convert string bits to
        return Integer.parseInt(first, 2) + Integer.parseInt(second, 2);
    }


    public static void main(String[] args) {
        System.out.println(bitCalculator("1011", "10")); //13
    }
}
