package Week3;

public class Remove_WhiteSpaces {

    // Remove WhiteSpaces from a String

    public static void main(String[] args) {
        System.out.println(removeWhiteSpace("nkjh ,jnjk jhghj  jkbjkh     j     kljl"));
    }


    static String removeWhiteSpace(String str){
        String newStr=str.replace("\\s","");
        return str;
    }
}
