import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number for checking odd or even");
        int n=in.nextInt();
        if(n%2==0)
        System.out.println("Even number");
        else
        System.out.println("Odd number");
    }
}
