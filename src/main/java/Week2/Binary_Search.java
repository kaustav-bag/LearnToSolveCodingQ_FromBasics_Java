package Week2;

public class Binary_Search {

    static boolean binarySearch(int[] arr, int number){

        int i=0;
        int j=arr.length-1;

        while(i<=j) {
            int mid = i + (j - i) / 2;

            if (number == arr[mid]) {
                return true;

            } else if (number < arr[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;

            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[] {1,4,8,14,23,25,30},14));
    }

}
