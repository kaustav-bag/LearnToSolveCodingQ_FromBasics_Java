package Week3;

import java.util.HashMap;
import java.util.Map;

public class OccuranceofChar {
    public static void main(String[] args) {
        String str="28686ghjg676vjh";

        Map<Character,Integer> hm=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
        }
        for (Character ch:hm.keySet()) {
            System.out.println(ch+"-->"+hm.get(ch));

        }
    }
}
