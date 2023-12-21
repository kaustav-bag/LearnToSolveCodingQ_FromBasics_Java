package Week1_SimpleMathsProblem_LogicBuilding;
import java.lang.Math;
public class _8_ArmStrongNumber {

   static boolean ifArmStrongNum(int num){

       int originalNum=num;
       int digitCount=0;
       while(num>0){
           num/=10;
           digitCount++;
       }

       int sum=0;
       int originalNum1=originalNum;
       while(originalNum>0){
           int digit=originalNum%10;
           sum+=Math.pow(digit,digitCount);
           originalNum/=10;
       }
       if (originalNum1==sum) return true;
       else return false;
   }

    public static void main(String[] args) {
       // System.out.println(ifArmStrongNum(153));
        for(int i=1;i<1000;i++){
           if( ifArmStrongNum(i)){
               System.out.println(i);
           }
        }
    }
}
