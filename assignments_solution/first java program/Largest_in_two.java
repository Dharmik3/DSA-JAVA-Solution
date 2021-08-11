import java.util.Scanner;

public class Largest_in_two {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numberes: ");
        int a=in.nextInt();
        int b=in.nextInt();
        if(a>b)
        System.out.println(a+" is largest");
        else
        System.out.println(b+" is largest");
    }
}
