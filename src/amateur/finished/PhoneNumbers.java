package amateur.finished;

//Write a function that takes a phone number with letters in it and converts it to one with only numbers.
// All input phone numbers will follow this pattern: "###-###-####" (Hint: Search for "phone keypad")

public class PhoneNumbers {

    public static void phoneNumber(String numbers){
        StringBuilder convertedNumber = new StringBuilder();

        //make numbers lowerCase
        numbers = numbers.toLowerCase();

        //go through each number/char in string
        for(char number: numbers.toCharArray()){
           //check if number is equal to any letters and cover it to numeric value

            if(number == 'a' || number == 'b' || number == 'c'){
                convertedNumber.append(2);
                continue;
            }

            if(number == 'd' || number == 'e' || number == 'f'){
                convertedNumber.append(3);
                continue;
            }

            if(number == 'g' || number == 'h' || number == 'i'){
                convertedNumber.append(4);
                continue;
            }

            if(number == 'j' || number == 'k' || number == 'l'){
                convertedNumber.append(5);
                continue;
            }

            if(number == 'm' || number == 'n' || number == 'o'){
                convertedNumber.append(6);
                continue;
            }

            if(number == 'p' || number == 'q' || number == 'r' || number == 's'){
                convertedNumber.append(7);
                continue;
            }

            if(number == 't' || number == 'u' || number == 'v'){
                convertedNumber.append(8);
                continue;
            }

            if(number == 'w' || number == 'x' || number == 'y' || number == 'z'){
                convertedNumber.append(9);
                continue;
            }

            convertedNumber.append(number);

        }

        System.out.println(convertedNumber);
    }


    public static void main(String[] args) {
        phoneNumber("210-367-CODE"); //210-367-2633
        phoneNumber("TRY-THE-FOOD"); //879-843-3663
    }
}
