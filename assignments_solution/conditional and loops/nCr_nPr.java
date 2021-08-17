public class nCr_nPr {
    static int fact(int n)
    {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        System.out.println("nPr is "+ (fact(n)/fact(n-r)));
        System.out.println("nCr is "+ (fact(n)/(fact(r)*fact(n-r))));
    }
}
