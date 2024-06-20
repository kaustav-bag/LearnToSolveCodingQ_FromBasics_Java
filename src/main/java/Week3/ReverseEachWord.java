package Week3;

public class ReverseEachWord {

    public static String reverseEachWord(String word){
        String[] splitted=word.split(" ");
        String wordReverse="";
        int i=0;

        int splittedStringLen=splitted.length;
        while(splittedStringLen>0){

            char[] ch=splitted[i].toCharArray();
            int charLen=ch.length;

            for(int j=ch.length-1;j>=0;j--){
                wordReverse+=ch[j];
            }
            i++;
            wordReverse+=" ";
            splittedStringLen--;
        }

        return wordReverse;
    }
    public static void main(String[] args) {
        // Reverse Each word

        String myWord="Hello world";
        System.out.println(reverseEachWord(myWord));
    }
}
