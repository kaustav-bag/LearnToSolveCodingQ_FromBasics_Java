package Week1_SimpleMathsProblem_LogicBuilding;

public class CountDigits {

    /*
    ***Q***
    * Given an integer num, return the number of digits in num that divide num.
     */

    public static int countDigits(int num) {
        int originalNum=num; // Understand why we have to store the original variable
        int count=0;
        while(num>0){
            int digits=num%10;
            if(originalNum%digits==0) count++;
            num/=10;

        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countDigits(121));
    }
}
