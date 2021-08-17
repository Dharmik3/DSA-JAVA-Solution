
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter units:");
        int n=in.nextInt();
        int bill=0;

        // for units 1-100  10RS
        //         101-200 15RS
        //         201-300 20RS
        //         ABOVE 300 25RS
                if(n<=100)
        {
            bill=n*10;
        }
        else if(n<=200)
        {
            bill=100*10 + (n-100)*15;
        }
        else if(n<=300)
        {
            bill=100*10+100*15+(n-200)*20;
        }
        else if(n>300)
        {
            bill=100*10+100*15+100*20+(n-300)*25;
        }
        System.out.println("Bill :"+bill+" RS");
    }
}
