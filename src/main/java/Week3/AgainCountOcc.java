package Week3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AgainCountOcc {
    public static void main(String[] args) {
        String str = "jhhfyghggy5ghjg765hjjgjg6bjhjg";
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

        }

        Iterator<Character> it = map.keySet().iterator();
        while (it.hasNext()) {
            char ch = it.next();
            System.out.println(ch + "-->" + map.get(ch));
        }
    }
}
