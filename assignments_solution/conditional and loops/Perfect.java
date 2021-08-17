import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=1;
        System.out.println("Enter number for checking perfect number:");
        int n=in.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            sum+=i;
        }
        if(sum==n)
        System.out.println("Perfect number");
        else
        System.out.println("Not perfect number");
    }
}
