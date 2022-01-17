package amateur.finished;

//Write a function called "multiply" that takes two integers and returns the product.
// You are NOT allowed to use the * operator or any imported multiplication function. We will check your code.

//Input: multiply(5, 6) | Output: 30
//Input: multiply(-1, 15) | Output: -15
//Input: multiply(-2, -7) | Output: 14

public class Multiply {

    public static int multiply(int first, int second){
        int product = 0;

        //check if both numbers are negative
        if(first < 0 && second < 0){

            //add first to itself a second number of times (3 * 2 -->  3 + 3)
            for(int i = 0; i < Math.abs(second); i++){ //make second numb positive
                product += first;
            }

            return Math.abs(product); //return positive value of product
        }

        else{
            for(int i = 0; i < second; i++){
                product += first;
            }
            return product;
        }


    }

    public static void main(String[] args) {

        System.out.println(multiply(5, 6)); //30
        System.out.println(multiply(-1, 15)); //-15
        System.out.println(multiply(-2, -7)); //14

    }
}
