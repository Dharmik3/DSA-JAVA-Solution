import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=in.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++)
        fact*=i;
        System.out.println("Factorial is :"+fact);
    }
}