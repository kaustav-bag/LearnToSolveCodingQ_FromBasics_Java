package Week3;

public class Primeagain {

    public static boolean ifPrime(int num){
        if (num<2) return false;
       /*      int count=0;

            for (int i=1;i<=1000;i++){
                if(num%i==0) count++;

            }
            if (count>2) return false;

            return true;

        }

        */
        int a=2;

        while(a*a<=num){
            if(num%a==0) return false;
            a++;
        }

        return a*a>num;
    }


    public static void main(String[] args) {

        //Find prime number betwwen 1 to 100

        // Aproach 1

        int count=0;
        for (int i=1;i<=1000;i++){
            if(ifPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Number of Prime Numbers are: "+count);

    }
}
