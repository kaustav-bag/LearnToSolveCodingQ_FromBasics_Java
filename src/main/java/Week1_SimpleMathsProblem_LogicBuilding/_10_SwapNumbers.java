package Week1_SimpleMathsProblem_LogicBuilding;

public class _10_SwapNumbers {
    static void swapUsingVar(int a,int b){
        int temp=b;
        b=a;
        a=temp;
        System.out.println("After swapping, a="+a+", b="+b);
    }
    static void swapWithoutVar(int a,int b){
       /* a=a+b; //Logic 1
        b=a-b;
        a=a-b;*/

        a=a*b; //Logic 2
        b=a/b;
        a=a/b;
        System.out.println("After swapping, a="+a+", b="+b);
    }

    public static void main(String[] args) {
       // swapUsingVar(3,7);
        swapWithoutVar(10,15);
    }
}
