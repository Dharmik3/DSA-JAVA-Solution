import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        float time,p,rate;
        System.out.print("Enter principal:");
        p=in.nextFloat();
        System.out.print("Enter time:");
        time=in.nextFloat();
        System.out.print("Enter rate:");
        rate=in.nextFloat();
        System.out.println("Interest is :"+(p*rate*time)/100);
    }
}
