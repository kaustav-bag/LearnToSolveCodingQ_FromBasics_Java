package Week3;

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,4,1,1,5,7,3,21,7,3,1));
        Set<Integer> set=new HashSet<>(list);
        List<Integer> noduplicate=new ArrayList<>(set);
        System.out.println(set);

    }
}
