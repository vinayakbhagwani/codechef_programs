import java.util.*;

class ReversingArray {

    public static void main(String[] args) {

        Integer[] arr = {32,43,54,21};
        reverse(arr);
    }

    static void reverse(Integer[] a) {
        
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
}
