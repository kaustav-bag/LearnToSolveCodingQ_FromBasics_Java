package Week3;

import java.util.Arrays;

public class Move_Zeroes {

    public static void main(String[] args) {
        int[] arr={0,3,6,0,6,7,8,4,3,0,5,0,8,0};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }

    static int[] moveZeroes(int[] arr){
        int i=0;
        int j=arr.length-1;

        while(i<=j){
            if (arr[j]==0){
                j--;
            }
            if (arr[i]==0 && arr[j]!=0){
                int temp=arr[j];
                arr[i]=temp;
                arr[j]=0;
            }
            i++;
        }
        return arr;
    }

}
