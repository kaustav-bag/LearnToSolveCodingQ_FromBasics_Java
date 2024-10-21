package Week4;

import java.util.Arrays;

public class MaxNumberOfKSum_1679 {
    public static void main(String[] args) {
        int[] arr={2,2,2,3,1,1,4,1};
        System.out.println(maxNum(arr,4));
    }

    static int maxNum(int[] nums,int k){

                Arrays.sort(nums);
                int i=0;
                int j=nums.length-1;
                int count=0;
                while(i<j){
                    if(nums[i]+nums[j]==k){
                        count++;
                        i++;
                        j--;
                    }
                    else if(nums[i]+nums[j]>k){
                        if(nums[i]<nums[j]){
                            j--;
                        }else{
                            i++;
                        }
                    }else{
                        if(nums[i]<nums[j]){
                            i++;
                        }else{
                            j--;
                        }
                    }
                }
                return count;
            }
        }

