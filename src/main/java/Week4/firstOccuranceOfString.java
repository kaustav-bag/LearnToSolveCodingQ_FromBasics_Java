package Week4;

public class firstOccuranceOfString {

    public static void main(String[] args) {
        System.out.println(firstOccurance("sadbutsad","sad"));
    }

    static int firstOccurance(String s1,String s2){
        if(s2.indexOf(s1)==0) return -1;
        return s1.indexOf(s2);
    }
}
