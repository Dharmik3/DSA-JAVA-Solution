import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter input number:");
        int n=in.nextInt();

        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
    static int factorial (int n)
    {
        int fact=1;
        for(int i=2;i<=n;i++)
        fact*=i;
        return fact;
    }
}
