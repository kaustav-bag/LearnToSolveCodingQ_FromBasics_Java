package Week1_SimpleMathsProblem_LogicBuilding;

public class SumOfMultiples {

    public static int sumOfMultiples(int n) {
        // Your code goes here
        int i=1;
        int sum=0;
        while(i<=n){
            if(i%3==0 || i%5==0 || i%7==0){
                sum+=i;
            }
            i++;
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(sumOfMultiples(7));
    }
}
