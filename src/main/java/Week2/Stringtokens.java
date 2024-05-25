package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class Stringtokens {

    // Given a string,matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
    // We define a token to be one or more consecutive English alphabetic letters.
    // Then, print the number of tokens, followed by each token on a new line.


    static void noOfTokens(String str){

        String[] tokens=str.split("[ !,?._'@]+");

        System.out.println(tokens.length);

        for(String str1:tokens) {

            System.out.println(str1);
        }
        //scan.useDelimiter("\\Z");
        //    String s = scan.next().trim();

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=str.trim();
        System.out.println(str2);
       // noOfTokens(str);
    }

}
