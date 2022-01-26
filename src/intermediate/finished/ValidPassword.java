package intermediate.finished;

//Write a function that determines whether or not a given string is a valid password.
// A password must follow these rules:
    //It must have a capital letter.
    //It must have at least one number.
    //It must contain a punctuation mark.
    //It cannot have the word "password" in it.
    //It must be between 7 and 21 char

public class ValidPassword {

    public static boolean validPassword(String password){

        //check that length is between 7 and 21 char
        if(password.length() < 7 || password.length() > 21){
            return false;
        }

        //check if has word 'password' in it  && check if contains capital letter
        else if(password.toLowerCase().contains("password") || password.toLowerCase().equals(password)){
            return false;
        }

        //check if contains number & contains punctuation mark
        else{
            boolean containsNumber = false;
            boolean containsPunctuation = false;

            for(int i = 0; i < password.length(); i++){

                char letter = password.charAt(i);

                //check if letter is a punctuation mark
                if(letter == '!' || letter == '?' || letter == '.'){
                    containsPunctuation = true;
                }

                //check if letter is a number
                if(Character.isDigit(letter)){
                    containsNumber = true;
                }
            }

            //last condition to check, return outcome
            return containsNumber && containsPunctuation;
        }

    }

    public static void main(String[] args) {
        System.out.println(validPassword("passWord101!")); //false
        System.out.println(validPassword("codE35?")); //true
    }
}
