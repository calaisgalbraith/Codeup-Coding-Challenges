package intermediate.finished;

//Write a function that will take a positive integer, convert it to binary, reverse the binary string,
// then return this reversed string in decimal form.

//35 --> 49

public class ReverseBinary {

    public static int reverseBinary(int number){

        //convert int to binary string
        String binary = Integer.toBinaryString(number);
        StringBuilder reversedBinary = new StringBuilder();

        //reverse string
        for(int i = 0; i < binary.length(); i++){
            reversedBinary.insert(0, binary.charAt(i));
        }

        //convert reversed binary string back to integer
        return Integer.parseInt(String.valueOf(reversedBinary), 2);
    }


    public static void main(String[] args) {
        System.out.println(reverseBinary(35)); //49
    }

}
