import static java.lang.System.out;

class RopeCutting {

    public static void main(String[] args) {

        int n=23;
        int a=9, b=11, c=12;

        out.println(maxCuts(n,a,b,c));
    }

    static int maxCuts(int n, int a, int b, int c) {

        if(n==0) return 0;

        if(n<=-1) return -1;

        int res = Math.max(maxCuts(n-a,a,b,c),
                Math.max(maxCuts(n-b,a,b,c),
                maxCuts(n-c,a,b,c)));
        
        if(res==-1) return -1;

        return res+1;
    }
}
