package finished;

public class NarcissisticNumbers {
    //A narcissistic number is a non-negative integer (n) with m digits where the sum of all the individual digits raised to the power m is equal to n.

    //For example:
    //If n is 153, then m (the number of digits) is 3 and:
    //1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
    //So, 153 is a narcissistic number.

    //Objective: Write a script to generate and output the first 25 narcissistic integers.

    public static boolean narcNumbers(long number){

        int total = 0;

        String stringNumber = Long.toString(number); //convert int number to string to be able to iterate through

        int power = stringNumber.length(); //get number of digits in number, the power to raise it to

        //iterate though each digit in number and raise to power of lenght, and add to total
        for(char letter : stringNumber.toCharArray()){
            total += Math.pow(Character.getNumericValue(letter), power);
        }

        return total == number;

    }

    public static void main(String[] args) {
        //find the first 25 numbers
        for(long number = 0,  j = 0; j < 25; number++){

            if(narcNumbers(number)){
                System.out.println(number);
                j++;
            }
        }

        //first 25 narc numbers
        //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        //153, 370, 371, 407
        //1634, 8208, 9474
        //54748, 92727, 93084
        //548834
        //1741725, 4210818, 9800817, 9926315

    }

}

