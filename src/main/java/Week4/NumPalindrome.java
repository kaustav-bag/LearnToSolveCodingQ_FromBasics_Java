package Week4;

public class NumPalindrome {
    public static void main(String[] args) {
        System.out.println(ifPalindrome(0));
        System.out.println(withString(0));
    }
    //int num=121;
    static boolean ifPalindrome(int num){
        if(num<0 || (num%10==0 && num!=0)){
            return false;
        }

        int original=num;
        int rev=0;

        while(num>0){
            rev=rev*10+(num%10);
            num=num/10;
        }
        return rev==original;
    }

    static boolean withString(int num){
        if(num==0) return true;
        String rev="";
        int original=num;

        while(num>0){
            int rem=num%10;
            rev+=String.valueOf(rem);
            num/=10;
        }
        return rev.equals(String.valueOf(original));

    }
}


