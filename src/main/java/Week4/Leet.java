package Week4;

import java.util.Arrays;

public class Leet {

    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
        public static int removeDuplicates(int[] nums) {
            int i=0;
            int j=0;
            int count=1;

            while(j<nums.length){
                // if(nums[i]==nums[j]) j++;

                if(nums[i]!=nums[j]){
                    nums[++i]=nums[j];
                    count++;
                }
                j++;

            }
            System.out.println(Arrays.toString(nums));
            return count;
        }

    }
