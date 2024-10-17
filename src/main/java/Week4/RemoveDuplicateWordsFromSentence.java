package Week4;

import Week3.ListToSet;

import java.util.*;

public class RemoveDuplicateWordsFromSentence {
    public static void main(String[] args) {
        String sentence="My Name Is My Is Kaustav Bag Kaustav My";
        //char[] ch=sentence.toCharArray();
        String[] words= sentence.split(" ");

        System.out.println(Arrays.toString(words));
        List<String> list=new ArrayList<>();
        for(String str:words){
            list.add(str);
        }
        list.remove(1);
        List<String> immutableList=List.of(words);
      //  immutableList.remove(1);
        System.out.println(list);
        System.out.println("Immu "+immutableList);


//        Set<String> withoutDuplicate=new LinkedHashSet<>();
//        System.out.println(withoutDuplicate);

    }
}
