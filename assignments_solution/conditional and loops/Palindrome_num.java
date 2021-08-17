import java.util.Scanner;

public class Palindrome_num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int temp=0,n;
        System.out.println("Enter any number:");
        n=in.nextInt();
        int origin=n,reminder;
        while(n>0)
        {
            reminder=n%10;
            temp=temp*10+reminder;
            n/=10;
        }
        if(temp==origin)
        System.out.println("Palindrome number");
        else
        System.out.println("Not Palindrome number");
    }
}
