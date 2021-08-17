import java.util.Scanner;

public class Allprime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter range with two numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        Prime( a, b);
    }
    static void Prime(int a ,int b)
    {
        int n=a,i;
        while(n<=b)
        {
            for( i=2;i<n;i++)
            {
                if(n%i==0){
                    break;
                }
                
             }
             if(i==n)
             System.out.println(n +" ");
             n++;
        }
     }
    
}
