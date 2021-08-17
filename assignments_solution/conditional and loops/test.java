import java.util.Arrays;

public class test{
    public static void main(String[] args) {
        fun(1,2,3,4,21,56,2);
    }
    static void fun(int ...x)
    {
        System.out.println(Arrays.toString(x));
    }
}