package Week4;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(product(arr)));
    }

    static int[] product(int[] arr) {
      /*  int i = 0;
        // int j=0;
        int sum = 1;
        int[] newArr = new int[arr.length];

        while (i < arr.length) {

            for (int j = 0; j < arr.length; j++) {
                if (j == i) continue;

                else {
                    sum *= arr[j];

                }
                 newArr[i]=sum;
            }
            i++;
            sum=1;
        }
        return newArr;*/
        int i = 0;
        // int j=0;
        int sum = 1;
        int[] newArr = new int[arr.length];

        for(int num:arr){
            sum*=num;
        }
        while(i<arr.length){
            newArr[i]=sum/arr[i];
            i++;
        }
        return newArr;
    }
}