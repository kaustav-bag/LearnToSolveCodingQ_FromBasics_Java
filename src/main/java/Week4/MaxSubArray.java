package Week4;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr={1,0,5,3,6,8,3,1,10,6,2,2,1};
        System.out.println(maxSubArray(arr,3));

    }

    static int maxSubArray(int[] arr,int k){
        int i=0;
        int j=0;
        int sum=0;
        int max=Integer.MIN_VALUE;

        while(j<arr.length){
            if(j-i+1<k) sum+=arr[j];

            else if (j-i+1==k) {
                sum+=arr[j];
                max=Math.max(sum,max);
                sum-=arr[i];
                i++;
            }
            j++;
        }
        return max;
    }
}
