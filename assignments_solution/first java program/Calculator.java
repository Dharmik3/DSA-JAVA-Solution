import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numberes: ");
        int a=in.nextInt();
        int b=in.nextInt();
        char choise;

    System.out.println("ENTER for\nAddition :+\nSubtraction :-\nDivision :/ \nMultiplication :*");
        choise=in.next().charAt(0);
        if(choise=='+')
        System.out.println("Ans :"+(a+b));
        else if(choise=='-')
        System.out.println("Ans :"+(a-b));
        else if(choise=='*')
        System.out.println("Ans :"+(a*b));
        else if(choise=='/')
        System.out.println("Ans :"+(a/b));
        else
        System.out.println("Invalid input!");
    
    }
}
