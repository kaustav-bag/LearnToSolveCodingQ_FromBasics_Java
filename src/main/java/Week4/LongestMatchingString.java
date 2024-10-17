package Week4;

import java.util.Arrays;

public class LongestMatchingString {
    public static void main(String[] args) {


        String[] strs={"flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }

  static String longestCommonPrefix(String[] strs){
      Arrays.sort(strs);
      StringBuilder sb=new StringBuilder();
      System.out.println(Arrays.toString(strs));
      String first=strs[0];
      String last=strs[strs.length-1];
      int i=0;
      while(i<Math.min(first.length(),last.length())){
          if(first.charAt(i)!=last.charAt(i)){
              return sb.toString();
          }
          else sb.append(first.charAt(i));
          i++;
      }
      return sb.toString();
    }
}
