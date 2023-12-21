package Week1_SimpleMathsProblem_LogicBuilding;

public class _7_Fibonacci_Series {
    /**Q**
     * Print fibonacci series till n , here n=7;
     *
     */

    static void fibonacciSeries(int num){
        int i=0,num1=0,num2=1,num3;
        System.out.println(num1);
        System.out.println(num2);

        while(i<num){
            num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
            i++;
        }

    }

    public static void main(String[] args) {
        fibonacciSeries(5);
        //Because 2 values we are printing before som for 7 we need to run the loop till 5
    }


}
