package Week2;

public class Factorial_Recursion {

    static int factorial(int num){

        if (num<1) return 1;

        int sum= factorial(num*(num-1));
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
