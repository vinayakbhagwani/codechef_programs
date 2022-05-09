import java.util.*;
import static java.lang.System.out;

class PrintNumOfGivenDigits {

    public static void main(String[] args) {

        int n=7;
        printFirstN(n);
    }

    static void printFirstN(int n) {

        Queue<String> q = new LinkedList<>();

        q.add("5");
        q.add("6");

        for(int i=0;i<n;i++) {

            String curr = q.poll();

            out.print(curr+" ");

            q.add(curr+"5");
            q.add(curr+"6");
        }
    }
}
