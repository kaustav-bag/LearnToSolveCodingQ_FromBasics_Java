package Week2;

public class MaxMinSubString {

    // find the smallest and largest substring of k size in a string

    static String maxminfun(String word, int k){

        String seq=word.substring(0,k);
        String largest=seq;
        String smallest=seq;
        for(int i=0;i<word.length()-k+1;i++){
            String str=word.substring(i,i+k);
            if(str.compareTo(smallest)<0) smallest=str;
            if(str.compareTo(largest)>0) largest=str;
            // System.out.print(str);
        }
       return smallest+"\n"+largest;
    }

    public static void main(String[] args) {
        System.out.print(maxminfun("Hello  Java",3));
    }
}
