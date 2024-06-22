package Week3;

import java.util.Arrays;

public class Difference_Split_whiteSpaces {

    //Difference between split(" ") and split("\\s")
    public static void main(String[] args) {
        String words="kjjknv kjnjknvs kjnjk     ,,klj  kjnvjk kjnkj ";
        String[] words1=words.split(" ");
        String[] words2=words.split("\\s");

        System.out.println(Arrays.toString(words1));
        System.out.println(Arrays.toString(words2));
    }



}
