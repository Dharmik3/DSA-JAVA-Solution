import java.util.Scanner;

public class Palindrome_num {
    static boolean isPalindrome(int n)
    {
        int origin=n;
        int reverse=0,rem;
        while(n>0)
        {
            rem=n%10;
            reverse=reverse*10+rem;
            n/=10;
        }
        if(reverse==origin)
        return true;
        else 
        return false;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n= input.nextInt();
        
        if(isPalindrome(n))
        System.out.println("Palindrome number");
        else
        System.out.println("Not palindrome number");
    }
    
}
