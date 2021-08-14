import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        //Taking input from the user
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Rupees:");
        float cash=in.nextFloat();
        System.out.println(0.013*cash +" $");
    }
}
