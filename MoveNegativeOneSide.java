import java.util.*;

class MoveNegativeOneSide {

    public static void main(String[] args) {

        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = 9;
        rearrangeArray(arr,n);
        printArray(arr);
    }

    static void rearrangeArray(int[] arr, int n) {
        int j=0,temp=0;
        for(int i=0;i<n;i++) {
            if(arr[i]<0){
                if(i!=j) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                } 
                j++;
            }
        }
    }

    static void printArray(int[] arr) {
         System.out.println(Arrays.toString(arr));
    }
}
