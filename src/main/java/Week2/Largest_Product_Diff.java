package Week2;

public class Largest_Product_Diff {
   public static int maxProductDifference(int[] nums) {



        int largest=0;
        int secondLargest=0;

        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;


        int i=0;

        while(i<nums.length){
            if(nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];

            }
            else if (nums[i]>secondLargest && nums[i]!=largest){
                secondLargest=nums[i];
            }

            if(nums[i]<smallest) {
                secondSmallest = smallest;
                smallest = nums[i];
            }

            else if(nums[i]<secondSmallest && nums[i]!=smallest){
                    secondSmallest=nums[i];
                }
                i++;

            }
        return (largest*secondLargest)-(smallest*secondSmallest);
        }


   /* public static int maxProductDifference(int[] nums) {
        int max1=0,max2=0,min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int a:nums)
        {
            if(a>=max1)
            {
                max2=max1;
                max1=a;
            }
            else if(max2<a)max2=a;

            if(a<min1)
            {
                min2=min1;
                min1=a;
            }
            else if(a<min2)min2=a;
        }
        return max1*max2-min1*min2;
    }*/



    public static void main(String[] args) {
        int[] nums={4,6,2,9,7,1};
        System.out.println(maxProductDifference(nums));
    }

  }