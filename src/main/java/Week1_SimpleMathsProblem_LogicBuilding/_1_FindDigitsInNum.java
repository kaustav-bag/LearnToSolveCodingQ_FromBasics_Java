package Week1_SimpleMathsProblem_LogicBuilding;
/*
 Author-Kaustav Bag
 */

// Question: Find digits in a given number and print it

/*Finding digit in a given number is important to solve many problems like ArmStrong Number and
 many more we'll see in coming Questions.

*** Understand the logic how we are using the loop to find each digits
 */
public class _1_FindDigitsInNum {
    static void findDigits(int num){
        int digits=0;
        while(num>0){
            digits=num%10;
            System.out.println(digits);
            num=num/10;
        }

    }

    public static void main(String[] args)
    {
        findDigits(123);
    }
}
