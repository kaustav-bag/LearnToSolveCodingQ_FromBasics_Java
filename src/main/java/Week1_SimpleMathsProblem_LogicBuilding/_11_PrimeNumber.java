package Week1_SimpleMathsProblem_LogicBuilding;


public class _11_PrimeNumber {

    static boolean primeNumber(int number){
        if (number <2) return false;

        int n=2;

        while(n*n<=number){
            if(number%n==0){
                return false;
            }
            n++;
        }
        return n*n>number;
    }

    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(primeNumber(i)){
                System.out.println(i);
            }
        }
    }
}
