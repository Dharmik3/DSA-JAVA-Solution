import java.util.Scanner;

public class Largest_in_N {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number upto 0: ");
        int n=in.nextInt();
        int max=n;
        while(n>0)
        {
             n=in.nextInt();
            if(n>max)
            max=n;
        }
        System.out.println("Largest number is :"+max);
    }
}
