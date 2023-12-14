package Week1_SimpleMathsProblem_LogicBuilding;

/*
    Find digits in a given number and print it
 */

public class FindDigitsInNum {
    static void findDigits(int num){
        int digits=0;
        while(num>0){
            digits=num%10;
            System.out.println(digits);
            num=num/10;
        }

    }

    public static void main(String[] args) {
        findDigits(123);
    }
}
