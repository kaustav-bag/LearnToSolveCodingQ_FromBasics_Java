package Week4;

import java.util.*;

public class FindDifferenceOfTwoArrays_2215 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={2,4,6};

        System.out.println(findDiff(arr1,arr2));

    }
    static List<List<Integer>> findDiff(int[] nums1,int[] nums2){
      //  Arrays.sort(nums1);
     //   Arrays.sort(nums2);
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }

        for(int num:nums2){
            set2.add(num);
        }

        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        for(int num:set2){
            if(!set1.contains(num)) list2.add(num);
        }
        for(int num:set1){
            if(!set2.contains(num)) list1.add(num);
        }

        List<List<Integer>> listOfList=new ArrayList<>();
        listOfList.add(list1);
        listOfList.add(list2);
        return listOfList;



    }
}
