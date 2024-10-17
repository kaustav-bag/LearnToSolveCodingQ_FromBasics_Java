package Week4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class CountOccuranceAgain {
    public static void main(String[] args) {
        String str="abcgsdmkjkjhjurskualhclh113123bhj";
        countOccurances(str);


    }

    static void countOccurances(String str){
        Map<Character,Integer> hm=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                hm.put(ch,hm.getOrDefault(ch,1)+1);
            }

        }
       /* for(char ch: hm.keySet()){
            System.out.print(ch+" : "+hm.get(ch)+" , ");
        }*/

    /*    Iterator<Character>it=hm.keySet().iterator();
        while(it.hasNext()){
            char key= it.next();
            System.out.println(key+"-->"+hm.get(key));
        }*/

        Iterator<Map.Entry<Character,Integer>> iterator=hm.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Character,Integer> map=iterator.next();

            System.out.println(map.getKey()+" "+map.getValue());
        }
        hm.keySet().size();
        hm.size();

    }
}
