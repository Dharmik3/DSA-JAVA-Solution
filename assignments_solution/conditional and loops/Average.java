import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("How many number you wants to enter:");
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int x=in.nextInt();
            sum+=x;
        }
        System.out.println("Average is "+(sum/n));
    }
}
