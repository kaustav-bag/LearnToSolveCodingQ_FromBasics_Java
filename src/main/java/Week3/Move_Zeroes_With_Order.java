package Week3;
import java.util.Arrays;

public class Move_Zeroes_With_Order {

    //int[] arr={1,0,1,0,23,50,0,23}

    //Swap Zeroes at the end
    public static void main(String[] args) {
        int[] nums = {1,2,0,3,0,0,0,3,0,2,0,0};
        System.out.println(Arrays.toString(swapZeroes(nums)));
    }

    static int[] swapZeroes(int[] nums) {

        int j = 0;

        // Index for non-zero elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i]; // Swap non-zero elements to the front
                j++;
            }
        }

        // Fill the remaining positions with zeroes
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
        return nums;
    }
}

         /*   int i = 0;
            int j = nums.length - 1;

            while (i <= j) {
                if(nums[j]==0) j--;

                if (nums[i] == 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    j--;
                }
                i++;
            }
            return nums;
        }*/


