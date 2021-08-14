import java.util.Scanner;

public class Sum_N{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number and for exit enter 0 :");
        int n=in.nextInt();
        int sum=0;
        while(n>0)
        {
            sum+=n;
             n=in.nextInt();
        }
        System.out.println("Ans is : "+sum);
    }
}