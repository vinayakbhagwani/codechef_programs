import java.util.*;

// ~ Vinayak ~ //

class DistinctUnionOfTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {2,3,4,5,6};
        int[] arr2 = {2,9};
        int firstArrSize = 5;
        int secondArrSize = 2;

        System.out.printf("%d",doUnion(arr1,firstArrSize,arr2,secondArrSize));
    }

    static int doUnion(int[] arr1, int m, int[] arr2, int n) {

        Set<Integer> union = new HashSet();
        
        for(int a: arr1) {
            union.add(a);
        }
            
        for(int b: arr2) {
            union.add(b);
        }

        return union.size();
    }
}
