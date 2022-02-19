import java.io.*;

public class HS08TEST {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] in = br.readLine().split(" ");
        float n = Float.parseFloat(in[0]);
        float b = Float.parseFloat(in[1]);

        if(n%5==0 && b>=n+0.5f)
            System.out.println(b-n-0.5f);
        else
            System.out.println(b);
    }
}