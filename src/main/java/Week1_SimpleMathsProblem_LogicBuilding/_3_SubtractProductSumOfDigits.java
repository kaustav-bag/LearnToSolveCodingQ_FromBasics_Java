package Week1_SimpleMathsProblem_LogicBuilding;

public class _3_SubtractProductSumOfDigits {

    /*Q2*
    Given an integer number n,
    return the difference between the product of its digits and the sum of its digits.
     */
    // In this we'll se how to find sum and digits within loop also find digits again
    static int findSubOfProSum(int num){

        int sum=0,product=1;

        while(num>0){
            int digits=num%10;
            sum+=digits;
            product*=digits;
            num=num/10;
        }
        return product-sum;
    }

    public static void main(String[] args) {
        System.out.println(findSubOfProSum(547));
    }

}
