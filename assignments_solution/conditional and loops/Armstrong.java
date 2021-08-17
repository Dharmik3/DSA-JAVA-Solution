import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int i=2;
        Scanner in=new Scanner(System.in);
        System.out.println("Checking armstrong number:");
        int n=in.nextInt();
        int sum=0,reminder;
        int orignalNum=n;
        while(n>0)
        {   
            reminder=n%10;
            sum+=Math.pow(reminder, 3);
            n/=10;
        }
        if(sum==orignalNum)
        System.out.println("Armstrong number");
        else
        System.out.println("Not armstrong number");
    }
}
