package Week2;

//Find if a particular element is present in arra

public class Linear_Serach {

    static boolean lineaerSearch(int[] arr, int number){
        int i=0;

        while(i<arr.length){
            if(number==arr[i]){
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,3,6,8,34,6};

        System.out.println(lineaerSearch(arr,34));
    }
}
