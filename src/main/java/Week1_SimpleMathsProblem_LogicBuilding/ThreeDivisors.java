package Week1_SimpleMathsProblem_LogicBuilding;

public class ThreeDivisors {

    /*
    **Q**
    * Given an integer n, return true if n has exactly three positive divisors.
     Otherwise, return false.
     */

    public static boolean isThree(int n) {
        // Your code goes here
        int i=1;
        int count=0;
        while(i<=n){
            if(n%i==0) {
                count++;
            }
            i++;
        }
        if(count==3) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isThree(4));
    }
}
