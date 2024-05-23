package Week2;

public class FindIfPalindrome {

    static boolean ifPalindrome(String str) {
       char[] ch=str.toLowerCase().toCharArray();
        /*
        String rev="";

        int i=str.length()-1;

        while(i>=0){
            rev+=ch[i];
            i--;
        }
        if(rev.equals(str)) return true;

        return false;

    }*/

        int i = 0;
        int j = str.length() - 1;

        while(i<=j){
            if(ch[i]==(ch[j])){
                j--;
            }
            else return false;

            i++;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(ifPalindrome("madam"));
    }
}
