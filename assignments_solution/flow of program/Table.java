import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("Which Table you want :");
        Scanner in =new Scanner(System.in);
        int table = in.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(table + " X " + i +" = " + table*i);
        }
    }
}
