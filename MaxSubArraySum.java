import java.io.*;

class MaxSubArraySum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0) {

            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");

            for(int i=0;i<n;i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            CalculateSum obj = new CalculateSum();
            System.out.println(obj.calcSum(arr,n));
        }
    }
}

class CalculateSum {

    public long calcSum(int[] arr, int n) {

        long result = arr[0];
        long check = arr[0];

        for(int i=1; i<n; i++) {
            check = Math.max(check+arr[i],arr[i]);
            result = Math.max(check,result);
        }

        return result;
    } 
}
