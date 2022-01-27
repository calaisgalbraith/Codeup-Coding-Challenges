package intermediate.finished;

//Write a function that will divide two integers without using the multiplication, division, or modulo operators


public class ManualDivision {

    //6 /3 == 3 + 3
    //10 /2 == 2 + 2 + 2 + 2 +2
    //add second number n times until equal first, that is quotient

    public static int divide(int first, int second){
        int answer = 1; //placeholder for quotient

        //keep increasing i by second until it equals first. increase quotient by 1 each iteration
        for(int i = second; i < first;){
            i += second;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(divide(6, 3)); //2
        System.out.println(divide(10, 2)); //5
        System.out.println(divide(30, 10)); //3
    }
}
