package Week2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MakeFirstCharUpper {

    //Make the first character in string upper case

    public static void main(String[] args) {

   /*     String message = "everyone loves java";
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            if(Character.isWhitespace(charArray[i])){
                foundSpace=true;
            }
        }
        message = String.valueOf(charArray);
        System.out.println(message);
    }
    */

        String message="hello word java";
        String[] spllited=message.split(" ");
       // System.out.println(Arrays.toString(spllited));
        int i=0;
        while(i<spllited.length){
          String ch=spllited[i].substring(0,1).toUpperCase();
          String str=spllited[i].substring(1);
          message=ch+str;
            System.out.print(message+" ");
          i++;
        }
    }
}