package Week1_SimpleMathsProblem_LogicBuilding;

public class _6_NumberOfSteps {

    /**Q**
     * Given an integer num, return the number of steps to reduce it to zero.
     *
     * In one step, if the current number is even, you have to divide it by 2,
     * otherwise, you have to subtract 1 from it.
     */

    public static int numberOfSteps(int num) {
        // Your code goes here

        int count=0;

        while(num!=0){
            if(num%2==0) {
                num=num/2;
                count++;
            }
            else {
                num=num-1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
