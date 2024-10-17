package Week4;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("*#*r6ad53@ap"));
    }

    static boolean isPalindrome(String str) {
        char[] ch = str.toCharArray();
        String original = "";
        int i = str.length() - 1;
        int j = 0;
        // int j=str.length()-1;
        while (j <= i) {
            if (Character.isLetter(ch[j])) {
                original += ch[j];

            }
            j++;
        }

            String rev = "";
            while (i >= 0) {
                if (Character.isLetter(ch[i])) {
                    rev += ch[i];
                }
                i--;

            }
            System.out.println(rev);
        System.out.println(original);
            return rev.equals(original);
        }
    }
