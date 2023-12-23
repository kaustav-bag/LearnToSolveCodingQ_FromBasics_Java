package Week1_SimpleMathsProblem_LogicBuilding;

public class _9_FindFactorial {
    /*
    **Q**
    * Find Factorial of a given number
    *
    * We can do it multiple ways
     */
   //This is using normal loop
    static int findFactorialSol1(int num){
        //int originalNum=num;
        int i=num-1;
        while(i>1){
            //num*=i;
            num*=i;
            i--;
        }
        return num;

    }

    //This is using Recursion
    static int findFactorialUsingRecursion(int num){
        if(num==1) return 1;
        return num*findFactorialUsingRecursion(num-1);
    }

    public static void main(String[] args) {
       // System.out.println(findFactorialSol1(5));
        System.out.println(findFactorialUsingRecursion(5));
    }
}
