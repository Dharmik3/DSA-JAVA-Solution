import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter numbers of terms:");
        int n=in.nextInt();
        int a=0;
        int b=1;
        int c=a+b;  
        System.out.print("0 1 ");
        while(n>2)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
            n--;
        }
    }
}
