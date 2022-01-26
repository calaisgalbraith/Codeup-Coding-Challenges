package intermediate;

//Create a function to validate if the given parameters are valid geo coordinates.
// Latitude (first) can be between 0 and 90, positive or negative.
// Longitude (second) can be between 0 and 180, positive or negative.
// Coordinates can only contain digits or one of the following symbols -, .
// There should not be a space between the minus "-" sign and the digit after it.

public class ValidCoordinates {

    public static boolean validCoordinates(String latitude, String longitude){






        return true;
    }

    public static void main(String[] args) {
        System.out.println(validCoordinates("24.78245", "23.64572")); //true
        System.out.println(validCoordinates("2,-37J425.87", "874.123")); //false

    }
}
