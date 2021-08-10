import java.util.Scanner;

public class Sum_x{
    public static void main(String[] args){

        System.out.println("If you wants to close entering number press x or X");
        Scanner in=new Scanner(System.in);
        int sum=0;
        // int n;
       
        // while(in.hasNextInt())
        // {
        //     n=in.nextInt();
        //     sum+=n;
        // }
        String s;
        while (true)
        {
            s=in.next();
            if(s.equals("x"))
            break;
            
            sum+=Integer.valueOf(s);
        
        }
        System.out.println("Sum is : "+sum);
    }
}