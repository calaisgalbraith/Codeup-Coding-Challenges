package amateur.finished;

//Write a function to calculate a person’s age based on the date entered in the format MM/DD/YYYY.

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

    public static int calculateAge(String date){

        //change format from MM/DD/YYYY to YYYY-MM-DD
        date = date.substring(6, 10) + "-" + date.substring(0, 2) + "-" + date.substring(3, 5);

        LocalDate birthday = LocalDate.parse(date); //convert string date to date
        LocalDate today = LocalDate.now(); //get current date

        Period p = Period.between(birthday, today); //get time between birthday and today

        return p.getYears(); //return years of period (age)
    }

    public static void main(String[] args) {
        System.out.println(calculateAge("11/04/1982")); //39
    }
}
