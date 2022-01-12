package finished;//Create a function that will:
    //Accept any number as input.
    //Validate that input and convert it to an integer as necessary.
    //Return the sum of the individual digits of that integer.

import java.util.Scanner;

public class SumOfDigits {

    //method to talley sum of individual digits
    public static int sumDigits(){
        int input = getInput(); //call method to get input
        int total = 0;

        while(input > 0){
            total += input % 10;
            input /= 10;
        }

        return total;
    }

    //method to get and validate user input
    public static int getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");

        String input = scanner.nextLine();
        int inputToReturn = 0;

        //try to return integer value of input, if issue print err message and call method again
        try{
            return Integer.valueOf(input);
        }
        catch (Exception e){
            System.out.println("Error! Number is not an integer");
            return getInput();
        }
    }


    public static void main(String[] args) {
        System.out.println(sumDigits());  //12345 --> //15
        System.out.println(sumDigits()); //567 -- > //18
    }
}
