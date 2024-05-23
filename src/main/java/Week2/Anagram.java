package Week2;

import java.util.Arrays;

public class Anagram {

    static boolean ifAnagram(String a, String b){

        a=a.replaceAll("\\s","").toLowerCase();
        b=b.replaceAll("\\s","").toLowerCase();

        if(a.length()!=b.length()) return false;

        char[] ch1=a.toCharArray();
        char[] ch2=b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    public static void main(String[] args) {
        System.out.println(ifAnagram("anagram","margana"));
    }
}
