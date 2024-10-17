package Week4;

import java.util.Arrays;

public class RemoveElement_27_Leet {
    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(removeElement(nums, 2));
    }

  /*  static int removeElement(int nums[], int val){
        int i=0;
        int j=nums.length-1;
        int count=0;
        int index=0;

        while(i<=j){
            if(nums[i]!=val){
                i++;
                count++;
            }
            if(nums[j]==val){
                j--;

            }
            if(nums[i]==val){
                // int index=i;
                nums[i]=nums[j];
                j--;
                i++;
                count++;
            }
            //  i++;

        }
        System.out.println(Arrays.toString(nums));

        return count;

    }*/
  public static int removeElement(int[] nums, int val) {
      int index = 0;
      for (int i = 0; i < nums.length; i++) {
          if (nums[i] != val) {
              nums[index] = nums[i];
              index++;
          }
      }
      System.out.println(Arrays.toString(nums));
      return index;
  }


}
