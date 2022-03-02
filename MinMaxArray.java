class MinMaxArray {

    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int[] arr, int n) {

        Pair minmax = new Pair();

        if(n==1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        
        if(arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }

        for(int i=2;i<n;i++) {
            if(arr[i]>minmax.max) {
                minmax.max=arr[i];
            } else if(arr[i]<minmax.min) {
                minmax.min=arr[i];
            }
        }

        return minmax;
    }

    public static void main(String[]  args) {

        int[] arr = {23,54,21,9,320,1000};
        int n = arr.length;
        Pair minmax = getMinMax(arr, n);
        System.out.printf("Minimum element is: %d\n",minmax.min);
        System.out.printf("Maximum element is: %d",minmax.max);
    }
}
