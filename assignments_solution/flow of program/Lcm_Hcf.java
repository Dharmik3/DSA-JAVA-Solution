import java.util.Scanner;

public class Lcm_Hcf {
public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    int a=in.nextInt();
    int b=in.nextInt();
    for(int i=a>b?a:b;i<=a*b;i+=a>b?a:b)
    {
        if(i%a==0&&i%b==0){
        System.out.println("LCM is :"+ i);
        break;
        }
    }
    for(int i=a<b?a:b;i>=1;i--)
    {
        if(a%i==0&& b%i==0){
        System.out.println("HCF is :"+i);
        return;
        }
    }

}
}