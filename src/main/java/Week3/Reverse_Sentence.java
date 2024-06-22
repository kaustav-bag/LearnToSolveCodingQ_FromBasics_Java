package Week3;

public class Reverse_Sentence {

    // Reverse each words in a sentence

    public static void main(String[] args) {
        System.out.println(reverseSentence("Hello Me KB"));
    }

    static String reverseSentence(String str){
        String[] sentences=str.split("\\s");
        String reverseSentences="";

        int length=sentences.length-1;

        while(length>=0){
            reverseSentences+=sentences[length];
            if(length!=0){
                reverseSentences+=" ";
            }

            length--;
        }
        return reverseSentences;

    }
}
