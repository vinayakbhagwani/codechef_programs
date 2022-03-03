import java.util.Arrays;

// ~ Vinayak ~ //

class KMinMaxArray {

    public static void main(String[] args) {

        int[] arr = {100,3,65,32,99,100};
        int n=6;
        int k=3;

        System.out.printf("The %dth largest element in the array is %d",k,findKMax(arr,n,k));
    }

    static int findKMax(int[] arr,int n,int k) {

        Arrays.sort(arr);
        return arr[k-1];
    }
}
