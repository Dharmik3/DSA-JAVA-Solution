import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Factors{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter any number:");
            int n= in.nextInt();
            System.out.println(1);
            for(int i=2;i<=n;i++)
            {
                if(n%i==0)
                System.out.println(i);
            }
    }
}