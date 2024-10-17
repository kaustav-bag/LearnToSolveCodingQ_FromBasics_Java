package Week4;

import java.util.Arrays;

public class TwoSum_1Indexed {

    public static void main(String[] args) {
        int[] arr={-1,0};
        System.out.println(Arrays.toString(twoSum(arr,-1)));
    }

        public static  int[] twoSum(int[] numbers, int target) {
    /*        int i=0;
            int j=numbers.length-1;

            while(i<=j){
                if(numbers[j]>target) j--;
                else if(numbers[i]+numbers[j]==target) return new int[] {i+1,j+1};
                else i++;
            }
            return null;

        }*/
            int i=0;
            int j=i+1;

            while(j<numbers.length){
                if(numbers[j]<=target){
                    if(numbers[i]+numbers[j]==target) return new int[] {i+1,j+1};
                    else j++;
                }
            }
            return null;


            }


    }
