package Week3;

public class Remove_WhiteSpaces {

    // Remove WhiteSpaces from a String

    public static void main(String[] args) {
        String str="My Name is    KB";
        System.out.println(removeWhiteSpace(str));
    }


    static String removeWhiteSpace(String str){
        String newStr=str.replaceAll("\\s","");
        return newStr;
    }
}
